/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.utils;

import java.util.Calendar;
import java.util.Date;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author catarinarib
 */
@XmlRootElement
public class Data {

    /**
     * O ano da data.
     */
    @XmlElement
    private int ano;

    /**
     * O mês da data.
     */
    @XmlElement
    private int mes;

    /**
     * O dia da data.
     */
    @XmlElement
    private int dia;

    /**
     * Hora.
     */
    @XmlElement
    private int hora;
    /**
     * Minuto.
     */
    @XmlElement
    private int minuto;

    /**
     * Segundos.
     */
    @XmlElement
    private int segundos;
    /**
     * O ano da data por omissão.
     */

    private static final int ANO_POR_OMISSAO = 1;

    /**
     * O mês da data por omissão.
     */
    private static final int MES_POR_OMISSAO = 1;

    /**
     * O dia da data por omissão.
     */
    private static final int DIA_POR_OMISSAO = 1;

    /**
     * Hora por omissao
     */
    private static final int HORA_POR_OMISSAO = 1;

    /**
     * Minutos por omissão.
     */
    private static final int MINUTOS_POR_OMISSAO = 1;

    /**
     * Segundos por omissao.
     */
    private static final int SEGUNDOS_POR_OMISSAO = 1;
    /**
     * Nomes dos dias da semana.
     */
    private static String[] nomeDiaDaSemana = {"Domingo", "Segunda-feira",
        "Terça-feira", "Quarta-feira",
        "Quinta-feira", "Sexta-feira",
        "Sábado"};

    /**
     * Número de dias de cada mês do ano.
     */
    private static int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30,
        31, 30, 31};

    /**
     * Nomes dos meses do ano.
     */
    private static String[] nomeMes = {"Inválido", "Janeiro", "Fevereiro",
        "Março", "Abril", "Maio", "Junho",
        "Julho", "Agosto", "Setembro",
        "Outubro", "Novembro", "Dezembro"};

    /**
     * Constrói uma instância de Data recebendo o ano, o mês, o dia, a hora, os
     * minutos, os segundos.
     *
     * @param ano o ano da data
     * @param mes o mês da data
     * @param dia o dia da data
     * @param hora hora
     * @param minutos minutos
     * @param segundos segundos
     */
    public Data(int ano, int mes, int dia, int hora, int minutos, int segundos) {
        setData(ano, mes, dia, hora, minutos, segundos);
    }

    /**
     * Constrói uma instância de Data recebendo o ano, o mês e o dia.
     *
     * @param ano o ano da data
     * @param mes o mês da data
     * @param dia o dia da data
     */
    public Data(int ano, int mes, int dia) {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;

    }

    /**
     * Constrói uma instância de Data com a data por omissão.
     */
    public Data() {
        ano = ANO_POR_OMISSAO;
        mes = MES_POR_OMISSAO;
        dia = DIA_POR_OMISSAO;
        hora = HORA_POR_OMISSAO;
        minuto = MINUTOS_POR_OMISSAO;
        segundos = SEGUNDOS_POR_OMISSAO;
    }

    /**
     * Devolve o ano da data.
     *
     * @return ano da data
     */
    public int getAno() {
        return ano;
    }

    /**
     * Devolve o mês da data.
     *
     * @return mês da data
     */
    public int getMes() {
        return mes;
    }

    /**
     * Devolve o dia da data.
     *
     * @return dia da data
     */
    public int getDia() {
        return dia;
    }

    /**
     * Devolve a hora
     *
     * @return hora
     */
    public int getHora() {
        return hora;
    }

    /**
     * Devolve os minutos
     *
     * @return minutos
     */
    public int getMinuto() {
        return minuto;
    }

    /**
     * Devolve os segundos
     *
     * @return segundos
     */
    public int getSegundos() {
        return segundos;
    }

    /**
     * Modifica o ano, o mês e o dia da data.
     *
     * @param ano o novo ano da data
     * @param mes o novo mês da data
     * @param dia o novo dia da data
     * @param hora a hora
     * @param minutos os minutos
     * @param segundos os segundos
     */
    public final void setData(int ano, int mes, int dia, int hora, int minutos, int segundos) {

        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        int diaAtual = c.get(Calendar.DAY_OF_MONTH);
        int mesAtual = c.get(Calendar.MONTH) + 1;
        int anoAtual = c.get(Calendar.YEAR);
        int horaAtual = c.get(Calendar.HOUR_OF_DAY);
        int minutosAtual = c.get(Calendar.MINUTE);
        int segundosAtual = c.get(Calendar.SECOND);

        if (ano < anoAtual) {
            throw new IllegalArgumentException("Ano inválido!");
        }
        this.ano = ano;

        if (mes < 1 || mes > 12 || ano == anoAtual && mes < mesAtual) {
            throw new IllegalArgumentException("Mês inválido!");
        }
        this.mes = mes;

        if (dia < 1 || dia > 31 || ano == anoAtual && mes == mesAtual && dia < diaAtual) {
            throw new IllegalArgumentException("Dia inválido!");
        }
        this.dia = dia;

        if (hora < 1 || hora > 24 || ano == anoAtual && mes == mesAtual && dia == diaAtual && hora < horaAtual) {
            throw new IllegalArgumentException("Hora inválida!");
        }
        this.hora = hora;
        if (minutos < 0 || minutos > 59 || ano == anoAtual && mes == mesAtual && dia == diaAtual && hora == horaAtual && minutos < minutosAtual) {
            throw new IllegalArgumentException("Minutos inválidos!");
        }

        this.minuto = minutos;

        if (segundos < 0 || segundos > 59 || ano == anoAtual && mes == mesAtual && dia == diaAtual && hora == horaAtual && minutos == minutosAtual && segundos < segundosAtual) {
            throw new IllegalArgumentException("Segundos inválidos!");
        }
        this.segundos = segundos;

    }

    /**
     * Devolve a descrição textual da data no formato: diaDaSemana, dia de mês
     * de ano.
     *
     * @return caraterísticas da data
     */
    @Override
    public String toString() {
        return diaDaSemana() + ", " + dia + " de " + nomeMes[mes] + " de " + ano;

    }

    /**
     * Devolve a data no formato:%04d/%02d/%02d.
     *
     * @return caraterísticas da data
     */
    public String toAnoMesDiaString() {
        return String.format("%04d/%02d/%02d %2d:%2d:$2d", ano, mes, dia, hora, minuto, segundos);
    }

    /**
     * Devolve o dia da semana da data.
     *
     * @return dia da semana da data
     */
    public String diaDaSemana() {
        int totalDias = contaDias();
        totalDias = totalDias % 7;

        return nomeDiaDaSemana[totalDias];
    }

    /**
     * Devolve true se a data for maior do que a data recebida por parâmetro. Se
     * a data for menor ou igual à data recebida por parâmetro, devolve false.
     *
     * @param outraData a outra data com a qual se compara a data
     * @return true se a data for maior do que a data recebida por parâmetro,
     * caso contrário devolve false
     */
    public boolean isMaior(Data outraData) {
        int totalDias = contaDias();
        int totalDias1 = outraData.contaDias();

        return totalDias > totalDias1;
    }

    /**
     * Devolve a diferença em número de dias entre a data e a data recebida por
     * parâmetro.
     *
     * @param outraData a outra data com a qual se compara a data para calcular
     * a diferença do número de dias
     * @return diferença em número de dias entre a data e a data recebida por
     * parâmetro
     */
    public int diferenca(Data outraData) {
        int totalDias = contaDias();
        int totalDias1 = outraData.contaDias();

        return Math.abs(totalDias - totalDias1);
    }

    /**
     * Devolve a diferença em número de dias entre a data e a data recebida por
     * parâmetro com ano, mês e dia
     *
     * @param ano o ano da data com a qual se compara a data para calcular a
     * diferença do número de dias
     * @param mes o mês da data com a qual se compara a data para calcular a
     * diferença do número de dias
     * @param dia o dia da data com a qual se compara a data para calcular a
     * diferença do número de dias
     * @return diferença em número de dias entre a data e a data recebida por
     * parâmetro com ano, mês e dia
     */
    public int diferenca(int ano, int mes, int dia) {
        int totalDias = contaDias();
        Data outraData = new Data(ano, mes, dia);
        int totalDias1 = outraData.contaDias();

        return Math.abs(totalDias - totalDias1);
    }

    /**
     * Devolve true se o ano passado por parâmetro for bissexto. Se o ano
     * passado por parâmetro não for bissexto, devolve false.
     *
     * @param ano o ano a validar
     * @return true se o ano passado por parâmetro for bissexto, caso contrário
     * devolve false
     */
    public static boolean isAnoBissexto(int ano) {
        return ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0;
    }

    /**
     * Devolve o número de dias desde o dia 1/1/1 até à data.
     *
     * @return número de dias desde o dia 1/1/1 até à data
     */
    private int contaDias() {
        int totalDias = 0;

        for (int i = 1; i < ano; i++) {
            totalDias += isAnoBissexto(i) ? 366 : 365;
        }
        for (int i = 1; i < mes; i++) {
            totalDias += diasPorMes[i];
        }
        totalDias += (isAnoBissexto(ano) && mes > 2) ? 1 : 0;
        totalDias += dia;

        return totalDias;
    }

}
