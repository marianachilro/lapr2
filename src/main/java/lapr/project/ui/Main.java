package lapr.project.ui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import lapr.project.controller.GerarAnaliseFAEController;
import lapr.project.model.Atribuicao;
import lapr.project.model.Avaliacao;
import lapr.project.model.CandidaturaExposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.ExposicaoEstado;
import lapr.project.model.FAE;
import lapr.project.model.Keyword;
import lapr.project.model.Local;
import lapr.project.model.MecanismoConflitoIdentidadeNumerica;
import lapr.project.model.MecanismoGeralDetecaoConflitos;
import lapr.project.model.RegistoExposicoes;
import lapr.project.model.Utilizador;
import lapr.project.utils.Data;
import org.xml.sax.SAXException;

/**
 * @author Nuno Bettencourt <nmb@isep.ipp.pt> on 24/05/16.
 */
class Main {

    /**
     * Private constructor to hide implicit public one.
     */
    private Main() {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, SAXException {

//        CentroExposicoes ce = new CentroExposicoes();
//        Utilizador gestor = new Utilizador(2, "Gestor", "gestor", "gestor@centro.pt", "aA;1", "ddddd");
//        ce.getRegistoUtilizadores().getListaUtilizadores().add(gestor);
//        Utilizador u = new Utilizador(2, "joao", "jo", "jo@centro.pt", "aB;1", "dpddd");
//        ce.getRegistoUtilizadores().getListaUtilizadores().add(u);
//        Utilizador u1 = new Utilizador(3, "carol", "carol", "carold@centro.pt", "aA;2", "ddddd");
//        ce.getRegistoUtilizadores().addUtilizador(u1);
//        Local l = new Local("Porto");
//        ce.getRegistoLocais().addLocal(l);
//        Data dati = new Data(2016, 07, 21, 20, 20, 20);
//        Data datf = new Data(2016, 07, 21, 20, 20, 23);
//        Exposicao exp = new Exposicao("titulo", "descricao", dati, datf, l, dati, dati,
//                dati, dati);
//        ce.getRegistoExposicoes().getListaExposicoes().add(exp);
//        exp.addOrganizador(u);
//        exp.addOrganizador(u1);
//        CandidaturaExposicao cex = new CandidaturaExposicao("rep@centro.pt", "nome empresa", "morada", 919999999, 23, 5);
//        exp.getListaCandidaturas().getListCandidaturas().add(cex);
//        CandidaturaExposicao cex3 = new CandidaturaExposicao("rep3@centro.pt", "nome empresa3", "morada3", 919999999, 23, 5);
//        exp.getListaCandidaturas().getListCandidaturas().add(cex3);
//        CandidaturaExposicao cex2 = new CandidaturaExposicao("rep2@centro.pt", "nome empresa2", "morada2", 919999999, 50, 2);
//        exp.getListaCandidaturas().getListCandidaturas().add(cex2);
//        cex.setDecisao(true);
//        cex3.setDecisao(true);
//        Keyword k = new Keyword("luz");
//        Keyword k1 = new Keyword("carro");
//        Keyword k3 = new Keyword("agua");
//        Keyword k4 = new Keyword("motas");
//        cex.getListaKeywords().addKeyword(k);
//        cex.getListaKeywords().addKeyword(k3);
//        cex3.getListaKeywords().addKeyword(k);
//        cex3.getListaKeywords().addKeyword(k4);
//        cex2.getListaKeywords().addKeyword(k1);
//        cex2.getListaKeywords().addKeyword(k4);
//        cex2.getListaKeywords().addKeyword(k);
//        cex2.getListaKeywords().addKeyword(k3);
//        Avaliacao a = new Avaliacao();
//        cex.getListaAvaliacoes().getListaAvaliacao().add(a);
//        FAE fae = new FAE(u1);
//        exp.getListaFAES().getListaFAEs().add(fae);
        
        
        CentroExposicoes ce = new CentroExposicoes();
        Local l = new Local("Porto");
        ce.getRegistoLocais().addLocal(l);
        Data dati = new Data(2016, 07, 21, 20, 20, 20);
        Data datf = new Data(2016, 07, 21, 20, 20, 23);
        Exposicao e = new Exposicao("titulo", "descricao", dati, datf, l, dati, dati,
                dati, dati);
        Utilizador a = new Utilizador(3, "carol", "carol", "carold@centro.pt", "aA;2", "ddddd");
        ce.getRegistoUtilizadores().addUtilizador(a);
        e.addOrganizador(a);
        List<CandidaturaExposicao> lc = new ArrayList<>();
        Utilizador gestor = new Utilizador(2, "Gestor", "gestor", "gestor@centro.pt", "aA;1", "ddddd");
        ce.getRegistoUtilizadores().getListaUtilizadores().add(gestor);
        Utilizador u1 = new Utilizador();
        u1.setNome("nome1");
        u1.setEmail("email1@lol");
        u1.setPassword("Pas,sword1");
        u1.setUsername("username1");
        ce.getRegistoUtilizadores().confirmaUtilizador(u1);
        Utilizador u2 = new Utilizador();
        u2.setNome("nome2");
        u2.setEmail("email2@lol");
        u2.setPassword("Pas,sword2");
        u2.setUsername("username2");
        ce.getRegistoUtilizadores().confirmaUtilizador(u2);
        CandidaturaExposicao c1 = new CandidaturaExposicao();
        c1.setEmailRep("e1k@ee");
        lc.add(c1);
        CandidaturaExposicao c2 = new CandidaturaExposicao();
        c1.setEmailRep("e2k@ee");
        lc.add(c2);
        CandidaturaExposicao c3 = new CandidaturaExposicao();
        c1.setEmailRep("e3k@ee");
        lc.add(c3);
        CandidaturaExposicao c4 = new CandidaturaExposicao();
        c1.setEmailRep("e4k@ee");
        lc.add(c4);
        CandidaturaExposicao c5 = new CandidaturaExposicao();
        c1.setEmailRep("e5k@ee");
        lc.add(c5);
        CandidaturaExposicao c6 = new CandidaturaExposicao();
        c1.setEmailRep("e6k@ee");
        lc.add(c6);
        CandidaturaExposicao c7 = new CandidaturaExposicao();
        c1.setEmailRep("e7k@ee");
        lc.add(c7);
        CandidaturaExposicao c8 = new CandidaturaExposicao();
        c1.setEmailRep("e8k@ee");
        lc.add(c8);
        CandidaturaExposicao c9 = new CandidaturaExposicao();
        c1.setEmailRep("e9k@ee");
        lc.add(c9);
        CandidaturaExposicao c10 = new CandidaturaExposicao();
        c1.setEmailRep("e10k@ee");
        lc.add(c10);
        CandidaturaExposicao c11 = new CandidaturaExposicao();
        c1.setEmailRep("e11k@ee");
        lc.add(c11);
        CandidaturaExposicao c12 = new CandidaturaExposicao();
        c1.setEmailRep("e12k@ee");
        lc.add(c12);
        CandidaturaExposicao c13 = new CandidaturaExposicao();
        c1.setEmailRep("e13k@ee");
        lc.add(c13);
        CandidaturaExposicao c14 = new CandidaturaExposicao();
        c1.setEmailRep("e14k@ee");
        lc.add(c14);
        CandidaturaExposicao c15 = new CandidaturaExposicao();
        c1.setEmailRep("e15k@ee");
        lc.add(c15);
        CandidaturaExposicao c16 = new CandidaturaExposicao();
        c1.setEmailRep("e16k@ee");
        lc.add(c16);
        CandidaturaExposicao c17 = new CandidaturaExposicao();
        c1.setEmailRep("e17k@ee");
        lc.add(c17);
        CandidaturaExposicao c18 = new CandidaturaExposicao();
        c1.setEmailRep("e18k@ee");
        lc.add(c18);
        CandidaturaExposicao c19 = new CandidaturaExposicao();
        c1.setEmailRep("e19k@ee");
        lc.add(c19);
        CandidaturaExposicao c20 = new CandidaturaExposicao();
        c1.setEmailRep("e20k@ee");
        lc.add(c20);
        CandidaturaExposicao c21 = new CandidaturaExposicao();
        c1.setEmailRep("e21k@ee");
        lc.add(c21);
        CandidaturaExposicao c22 = new CandidaturaExposicao();
        c1.setEmailRep("e22k@ee");
        lc.add(c22);
        CandidaturaExposicao c23 = new CandidaturaExposicao();
        c1.setEmailRep("e23k@ee");
        lc.add(c23);
        CandidaturaExposicao c24 = new CandidaturaExposicao();
        c1.setEmailRep("e24k@ee");
        lc.add(c24);
        CandidaturaExposicao c25 = new CandidaturaExposicao();
        c1.setEmailRep("e25k@ee");
        lc.add(c25);
        CandidaturaExposicao c26 = new CandidaturaExposicao();
        c1.setEmailRep("e26k@ee");
        lc.add(c26);
        CandidaturaExposicao c27 = new CandidaturaExposicao();
        c1.setEmailRep("e27k@ee");
        lc.add(c27);
        CandidaturaExposicao c28 = new CandidaturaExposicao();
        c1.setEmailRep("e28k@ee");
        lc.add(c28);
        CandidaturaExposicao c29 = new CandidaturaExposicao();
        c1.setEmailRep("e29k@ee");
        lc.add(c29);
        CandidaturaExposicao c30 = new CandidaturaExposicao();
        c1.setEmailRep("e30k@ee");
        lc.add(c30);
        CandidaturaExposicao c31 = new CandidaturaExposicao();
        c1.setEmailRep("e31k@ee");
        lc.add(c31);
        FAE f = new FAE(u1);
        FAE f2 = new FAE(u2);
        
        RegistoExposicoes re = ce.getRegistoExposicoes();
        re.registaExposicao(e);
        e.getListaCandidaturas().setListCandidaturas(lc);
        e.getListaFAES().registaFae(f);
        e.getListaFAES().registaFae(f2);
        List<Atribuicao> lat = new ArrayList<>();
        for (CandidaturaExposicao c : lc) {
            Atribuicao ata = new Atribuicao(f, c);
            lat.add(ata);
            ata = new Atribuicao(f2, c);
            lat.add(ata);
        }
        e.getListaAtribuicoes().setLista(lat);

        for (int n = 0; n < lc.size(); n++) {
            for (Atribuicao at : e.getListaAtribuicoes().getLista()) {
                Avaliacao avaliacao = e.getListaCandidaturas().getListCandidaturas().get(n).getListaAvaliacoes().novaAvaliacao();
                avaliacao.setAtribuicao(at);
                if (n < 25) {
                    avaliacao.setRespostaAdequacaoCandDemonstracao(5);
                    avaliacao.setRespostaAdequacaoCandExposicao(5);
                    avaliacao.setRespostaAdequacaoNumConvites(5);
                    avaliacao.setRespostaRecomendacaoGlobal(5);
                    avaliacao.setRespostaTemaExpo(3);
                } else {
                    avaliacao.setRespostaAdequacaoCandDemonstracao(0);
                    avaliacao.setRespostaAdequacaoCandExposicao(0);
                    avaliacao.setRespostaAdequacaoNumConvites(0);
                    avaliacao.setRespostaRecomendacaoGlobal(0);
                    avaliacao.setRespostaTemaExpo(1);
                }
                
                e.getListaCandidaturas().getListCandidaturas().get(n).getListaAvaliacoes().addAvaliacao(avaliacao);
            }
        }

        LoginUI login = new LoginUI(ce);

    }

}
