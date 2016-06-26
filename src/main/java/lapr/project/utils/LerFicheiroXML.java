/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import lapr.project.model.CandImpEstado;
import lapr.project.model.CandidaturaAceiteEstado;
import lapr.project.model.CandidaturaAlteradaEstado;
import lapr.project.model.CandidaturaAvaliadaEstado;
import lapr.project.model.CandidaturaCompletaEstado;
import lapr.project.model.CandidaturaConfirmarStandEstado;
import lapr.project.model.CandidaturaConflitosAlteradosEstado;
import lapr.project.model.CandidaturaConflitosDetetadosEstado;
import lapr.project.model.CandidaturaDemonstracao;
import lapr.project.model.CandidaturaEmAvaliacaoEstado;
import lapr.project.model.CandidaturaEmSubmissaoEstado;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CandidaturaGeral;
import lapr.project.model.CandidaturaInicialEstado;
import lapr.project.model.CandidaturaNaoAvaliadaEstado;
import lapr.project.model.CandidaturaNaoConfirmarStandEstado;
import lapr.project.model.CandidaturaRejeitadaEstado;
import lapr.project.model.CandidaturaRemovidaEstado;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.DemoImpEstado;
import lapr.project.model.Demonstracao;
import lapr.project.model.DemonstracaoCandidaturasAbertasEstado;
import lapr.project.model.DemonstracaoCandidaturasAtribuidasEstado;
import lapr.project.model.DemonstracaoCandidaturasAvaliadasEstado;
import lapr.project.model.DemonstracaoCandidaturasDecididasEstado;
import lapr.project.model.DemonstracaoCandidaturasFechadasEstado;
import lapr.project.model.DemonstracaoConfirmadaEstado;
import lapr.project.model.DemonstracaoConflitosAtualizadosEstado;
import lapr.project.model.DemonstracaoConflitosDetetadosEstado;
import lapr.project.model.DemonstracaoCriadaEstado;
import lapr.project.model.DemonstracaoInicialEstado;
import lapr.project.model.DemonstracaoNaoConfirmadaEstado;
import lapr.project.model.ExpoImpEstado;
import lapr.project.model.Exposicao;
import lapr.project.model.ExposicaoCandidaturasDemosAbertasEstado;
import lapr.project.model.ExposicaoCandidaturasDemosAtribuidasEstado;
import lapr.project.model.ExposicaoCandidaturasDemosAvaliadasEstado;
import lapr.project.model.ExposicaoCandidaturasDemosDecididasEstado;
import lapr.project.model.ExposicaoCandidaturasDemosFechadasEstado;
import lapr.project.model.ExposicaoCandidaturasExpoAbertasEstado;
import lapr.project.model.ExposicaoCandidaturasExpoAtribuidasEstado;
import lapr.project.model.ExposicaoCandidaturasExpoAvaliadasEstado;
import lapr.project.model.ExposicaoCandidaturasExpoDecididasEstado;
import lapr.project.model.ExposicaoCandidaturasExpoFechadasEstado;
import lapr.project.model.ExposicaoCompletaEstado;
import lapr.project.model.ExposicaoConflitosAtualizadosDemosEstado;
import lapr.project.model.ExposicaoConflitosDetetadosDemosEstado;
import lapr.project.model.ExposicaoConflitosDetetadosExpoEstado;
import lapr.project.model.ExposicaoCriadaEstado;
import lapr.project.model.ExposicaoDemoSemFAEEstado;
import lapr.project.model.ExposicaoDemonstracoesConfirmadasEstado;
import lapr.project.model.ExposicaoFAESemDemoEstado;
import lapr.project.model.ExposicaoInicialEstado;
import lapr.project.model.ExposicaoStandsAtribuidosEstado;
import lapr.project.model.ExposicaoStandsConfirmadosEstado;
import lapr.project.model.FAE;
import lapr.project.model.Organizador;
import lapr.project.model.Security;
import lapr.project.model.Utilizador;

/**
 *
 * @author miniondevil
 */
public class LerFicheiroXML {

    /**
     * Ficheiro a ler.
     */
    private final File ficheiro;

    /**
     * Contrutor que recebe o ficheiro a ler;
     *
     * @param ficheiro
     */
    public LerFicheiroXML(File ficheiro) {
        this.ficheiro = ficheiro;
    }

    /**
     * Método que lê um centro de exposições de um ficheiro XML e o retorna.
     *
     * @return
     */
    public CentroExposicoes lerCentro() {
        CentroExposicoes centro = new CentroExposicoes();
        try {

            JAXBContext jaxbContext = JAXBContext.newInstance(CentroExposicoes.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            centro = (CentroExposicoes) jaxbUnmarshaller.unmarshal(ficheiro);

        } catch (JAXBException e) {
            System.out.println(e.getCause());
        }
        for (Exposicao e : centro.getRegistoExposicoes().getListaExposicoes()) {
            for (Organizador o : e.getListaOrganizadores().getListaOrganizadores()) {
                boolean existeO = false;
                for (Utilizador u : centro.getRegistoUtilizadores().getListaUtilizadores()) {
                    if (o.getUtilizador().equals(u)) {
                        existeO = true;
                    }
                }
                if (existeO == false) {
                    centro.getRegistoUtilizadores().addUtilizador(o.getUtilizador());
                }
            }
            for (FAE fae : e.getListaFAES().getListaFAEs()) {
                boolean existeF = false;
                for (Utilizador u : centro.getRegistoUtilizadores().getListaUtilizadores()) {
                    if (fae.getUtilizador().equals(u)) {
                        existeF = true;
                    }
                }
                if (existeF == false) {
                    centro.getRegistoUtilizadores().addUtilizador(fae.getUtilizador());
                }
            }
        }
        descodificarDados(centro.getRegistoUtilizadores().getListaUtilizadores());
        descodificarDados(centro.getRegistoUtilizadoresNaoConfirmados().getListaUtilizadores());
        List<Utilizador> lu = new ArrayList<>();
        for (Exposicao e : centro.getRegistoExposicoes().getListaExposicoes()) {
            for (Organizador o : e.getListaOrganizadores().getListaOrganizadores()) {
                lu.add(o.getUtilizador());
            }
            for (FAE fae : e.getListaFAES().getListaFAEs()) {
                lu.add(fae.getUtilizador());
            }
        }
        descodificarDados(lu);
        return centro;
    }
    /**
     * Método que atribui estados.
     * @param centro 
     */
    public void setEstados(CentroExposicoes centro){
        for(Exposicao e : centro.getRegistoExposicoes().getListaExposicoes()){
            setEstadosExpo(e);
            for(CandidaturaExposicao c : e.getListaCandidaturas().getListCandidaturas()){
                setEstadosCand(c);
            }
            for(Demonstracao d : e.getListaDemonstracoes().getListaDemonstracao()){
                setEstadosDemo(d);
                for(CandidaturaDemonstracao c : d.getListaCandidaturas().getListCandidaturas()){
                    setEstadosCand(c);
                }
            }
        }
        
    }
    /**
     * Método que atribui um estado à demonstracao.
     * @param d 
     */
    public void setEstadosDemo(Demonstracao d){
        DemoImpEstado st = d.getEstado();
        if(st.getTipo().equalsIgnoreCase("demonstracaoCandidaturasAbertas")){
            d.setEstado(new DemonstracaoCandidaturasAbertasEstado(d));
        }else if (st.getTipo().equalsIgnoreCase("demonstracaoCandidaturasAtribuidas")){
            d.setEstado(new DemonstracaoCandidaturasAtribuidasEstado(d));
        }else if (st.getTipo().equalsIgnoreCase("demonstracaoCandidaturasAvaliadas")){
            d.setEstado(new DemonstracaoCandidaturasAvaliadasEstado(d));
        }else if (st.getTipo().equalsIgnoreCase("demonstracaoCandidaturasDecididas")){
            d.setEstado(new DemonstracaoCandidaturasDecididasEstado(d));
        }else if (st.getTipo().equalsIgnoreCase("demonstracaoCandidaturasFechadas")){
            d.setEstado(new DemonstracaoCandidaturasFechadasEstado(d));
        }else if (st.getTipo().equalsIgnoreCase("demonstracaoConfirmada")){
            d.setEstado(new DemonstracaoConfirmadaEstado(d));
        }else if (st.getTipo().equalsIgnoreCase("demonstracaoConflitosAtualizados")){
            d.setEstado(new DemonstracaoConflitosAtualizadosEstado(d));
        }else if (st.getTipo().equalsIgnoreCase("demonstracaoConflitosDetetados")){
            d.setEstado(new DemonstracaoConflitosDetetadosEstado(d));
        }else if (st.getTipo().equalsIgnoreCase("demonstracaoCriada")){
            d.setEstado(new DemonstracaoCriadaEstado(d));
        }else if (st.getTipo().equalsIgnoreCase("demonstracaoInicial")){
            d.setEstado(new DemonstracaoInicialEstado(d));
        }else{
            d.setEstado(new DemonstracaoNaoConfirmadaEstado(d));
        }
    }
    /**
     * método que atribui um estado à candidatura
     * @param c 
     */
    public void setEstadosCand(CandidaturaGeral c){
        CandImpEstado st = c.getEstado();
        if(st.getTipo().equalsIgnoreCase("candidaturaAceite")){
            c.setEstado(new CandidaturaAceiteEstado(c));
        }else if (st.getTipo().equalsIgnoreCase("candidaturaAlterada")){
            c.setEstado(new CandidaturaAlteradaEstado(c));
        }else if (st.getTipo().equalsIgnoreCase("candidaturaAvaliada")){
            c.setEstado(new CandidaturaAvaliadaEstado(c));
        }else if (st.getTipo().equalsIgnoreCase("candidaturaCompleta")){
            c.setEstado(new CandidaturaCompletaEstado(c));
        }else if (st.getTipo().equalsIgnoreCase("candidaturaConfirmarStand")){
            c.setEstado(new CandidaturaConfirmarStandEstado(c));
        }else if (st.getTipo().equalsIgnoreCase("candidaturaConflitosAlterados")){
            c.setEstado(new CandidaturaConflitosAlteradosEstado(c));
        }else if (st.getTipo().equalsIgnoreCase("candidaturaConflitosDetetados")){
            c.setEstado(new CandidaturaConflitosDetetadosEstado(c));
        }else if (st.getTipo().equalsIgnoreCase("candidaturaEmAvaliacao")){
            c.setEstado(new CandidaturaEmAvaliacaoEstado(c));
        }else if (st.getTipo().equalsIgnoreCase("candidaturaEmSubmisao")){
            c.setEstado(new CandidaturaEmSubmissaoEstado(c));
        }else if (st.getTipo().equalsIgnoreCase("candidaturaInicial")){
            c.setEstado(new CandidaturaInicialEstado(c));
        }else if (st.getTipo().equalsIgnoreCase("candidaturaNaoAvaliada")){
            c.setEstado(new CandidaturaNaoAvaliadaEstado(c));
        }else if (st.getTipo().equalsIgnoreCase("candidaturaNaoConfirmarStand")){
            c.setEstado(new CandidaturaNaoConfirmarStandEstado(c));
        }else if (st.getTipo().equalsIgnoreCase("candidaturaRejeitada")){
            c.setEstado(new CandidaturaRejeitadaEstado(c));
        }else{
            c.setEstado(new CandidaturaRemovidaEstado(c));
        }
    }
    /**
     * método que atribui um estado à expo.
     * @param e 
     */
    public void setEstadosExpo(Exposicao e){
       ExpoImpEstado st = e.getEstado();
       if(st.getTipo().equalsIgnoreCase("exposicaoCandidaturasDemosAbertas")){
           e.setEstado(new ExposicaoCandidaturasDemosAbertasEstado(e));
       }else if(st.getTipo().equalsIgnoreCase("exposicaoCandidaturasDemosAtribuidas")){
           e.setEstado(new ExposicaoCandidaturasDemosAtribuidasEstado(e));
       }else if (st.getTipo().equalsIgnoreCase("exposicaoCandidaturasDemosAvaliadas")){
           e.setEstado(new ExposicaoCandidaturasDemosAvaliadasEstado(e));
       }else if (st.getTipo().equalsIgnoreCase("exposicaoCandidaturasDemosDecididas")){
           e.setEstado(new ExposicaoCandidaturasDemosDecididasEstado(e));
       }else if (st.getTipo().equalsIgnoreCase("exposicaoCandidaturasDemosFechadas")){
           e.setEstado(new ExposicaoCandidaturasDemosFechadasEstado(e));
       }else if (st.getTipo().equalsIgnoreCase("exposicaoCandidaturasExpoAbertas")){
           e.setEstado(new ExposicaoCandidaturasExpoAbertasEstado(e));
       }else if (st.getTipo().equalsIgnoreCase("exposicaoCandidaturasExpoAtribuidas")){
           e.setEstado(new ExposicaoCandidaturasExpoAtribuidasEstado(e));
       }else if (st.getTipo().equalsIgnoreCase("exposicaoCandidaturasExpoAvaliadas")){
           e.setEstado(new ExposicaoCandidaturasExpoAvaliadasEstado(e));
       }else if (st.getTipo().equalsIgnoreCase("exposicaoCandidaturasExpoDecididas")){
           e.setEstado(new ExposicaoCandidaturasExpoDecididasEstado(e));
       }else if (st.getTipo().equalsIgnoreCase("exposicaoCandidaturasExpoFechadas")){
           e.setEstado(new ExposicaoCandidaturasExpoFechadasEstado(e));
       }else if (st.getTipo().equalsIgnoreCase("exposicaoCompleta")){
           e.setEstado(new ExposicaoCompletaEstado(e));
       }else if (st.getTipo().equalsIgnoreCase("exposicaoConflitosAtualizadosDemos")){
           e.setEstado(new ExposicaoConflitosAtualizadosDemosEstado(e));
       }else if (st.getTipo().equalsIgnoreCase("exposicaoConflitosAtualizadosExpo")){
           e.setEstado(new ExposicaoConflitosDetetadosExpoEstado(e));
       }else if (st.getTipo().equalsIgnoreCase("exposicaoConflitosDetetadosDemos")){
           e.setEstado(new ExposicaoConflitosDetetadosDemosEstado(e));
       }else if (st.getTipo().equalsIgnoreCase("exposicaoConflitosDetetadosExpo")){
           e.setEstado(new ExposicaoConflitosDetetadosExpoEstado(e));
       }else if (st.getTipo().equalsIgnoreCase("exposicaoCriada")){
           e.setEstado(new ExposicaoCriadaEstado(e));
       }else if (st.getTipo().equalsIgnoreCase("exposicaoDemoSemFAE")){
           e.setEstado(new ExposicaoDemoSemFAEEstado(e));
       }else if (st.getTipo().equalsIgnoreCase("exposicaoDemosntracoesConfirmadas")){
           e.setEstado(new ExposicaoDemonstracoesConfirmadasEstado(e));
       }else if (st.getTipo().equalsIgnoreCase("exposicaoFAESemDemo")){
           e.setEstado(new ExposicaoFAESemDemoEstado(e));
       }else if (st.getTipo().equalsIgnoreCase("ExposicaoInicial")){
           e.setEstado(new ExposicaoInicialEstado(e));
       }else if (st.getTipo().equalsIgnoreCase("exposicaoStandsAtribuidos")){
           e.setEstado(new ExposicaoStandsAtribuidosEstado(e));
       }else if (st.getTipo().equalsIgnoreCase("exposicaoStandsConfirmadosEstado")){
           e.setEstado(new ExposicaoStandsConfirmadosEstado(e));
       }
       
    }
            

    /**
     * Método que lê um centro de exposições apartir de um ficheiro XML e
     * retorna as exposições do centor.
     *
     * @return
     */
    public List<Exposicao> lerExposicoes() {
        CentroExposicoes centro = lerCentro();

        return centro.getRegistoExposicoes().getListaExposicoes();
    }

    public void descodificarDados(List<Utilizador> lu) {
        for (Utilizador u : lu) {
            Security s = new Security(u.getShift(), u.getKeyword());
            u.setKeyword(s.descodificarShift(u.getKeyword()));

            Security s2 = new Security(u);
            u.setNome(s2.desencriptarSubstitutionAndTranspositionCipher(u.getNome()));
            u.setEmail(s2.desencriptarSubstitutionAndTranspositionCipher(u.getEmail()));
            u.setUsername(s2.desencriptarSubstitutionAndTranspositionCipher(u.getUsername()));
            u.setPassword(s2.descodificarShift(u.getPassword()));

        }
    }
    
}
