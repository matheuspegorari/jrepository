package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class MovimentoBancario extends AbstractSankhyaEntity<MovimentoBancario> {
   private BigDecimal codCtabcoContra;
   private BigDecimal codCtabcoInt;
   private BigDecimal codCtabcoIntDest;
   private BigDecimal codLanc;
   private BigDecimal codLancDest;
   private BigDecimal codTipOper;
   private BigDecimal codUsu;
   private String conciliado;
   private String conciliadoDest;
   private Timestamp dhConciliacao;
   private Timestamp dhTipOper;
   private Timestamp dtAlter;
   private Timestamp dtContab;
   private Timestamp dtInclusao;
   private Timestamp dtLanc;
   private String historico;
   private BigDecimal nuBco;
   private BigDecimal nuBcoCp;
   private BigDecimal numDoc;
   private BigDecimal numTransf;
   private String origMov;
   private Timestamp preData;
   private BigDecimal recDesp;
   private BigDecimal saldo;
   private BigDecimal talao;
   private BigDecimal vlrCheque;
   private BigDecimal vlrLanc;
   private BigDecimal vlrLancDestino;
   private BigDecimal vlrMoeda;
   private BigDecimal vlrTroco;
   private BigDecimal codPdv;
   private String contabilizado;
   private BigDecimal nroImport;
   private BigDecimal nuCaixa;

   public BigDecimal getCodCtabcoContra() {
        return codCtabcoContra;
   }

   public void setCodCtabcoContra(BigDecimal codCtabcoContra) {
        markAsChanged("CODCTABCOCONTRA", codCtabcoContra);
        this.codCtabcoContra = codCtabcoContra;
   }

   public BigDecimal getCodCtabcoInt() {
        return codCtabcoInt;
   }

   public void setCodCtabcoInt(BigDecimal codCtabcoInt) {
        markAsChanged("CODCTABCOINT", codCtabcoInt);
        this.codCtabcoInt = codCtabcoInt;
   }

   public BigDecimal getCodCtabcoIntDest() {
        return codCtabcoIntDest;
   }

   public void setCodCtabcoIntDest(BigDecimal codCtabcoIntDest) {
        markAsChanged("CODCTABCOINTDEST", codCtabcoIntDest);
        this.codCtabcoIntDest = codCtabcoIntDest;
   }

   public BigDecimal getCodLanc() {
        return codLanc;
   }

   public void setCodLanc(BigDecimal codLanc) {
        markAsChanged("CODLANC", codLanc);
        this.codLanc = codLanc;
   }

   public BigDecimal getCodLancDest() {
        return codLancDest;
   }

   public void setCodLancDest(BigDecimal codLancDest) {
        markAsChanged("CODLANCDEST", codLancDest);
        this.codLancDest = codLancDest;
   }

   public BigDecimal getCodTipOper() {
        return codTipOper;
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        markAsChanged("CODTIPOPER", codTipOper);
        this.codTipOper = codTipOper;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public String getConciliado() {
        return conciliado;
   }

   public void setConciliado(String conciliado) {
        markAsChanged("CONCILIADO", conciliado);
        this.conciliado = conciliado;
   }

   public String getConciliadoDest() {
        return conciliadoDest;
   }

   public void setConciliadoDest(String conciliadoDest) {
        markAsChanged("CONCILIADODEST", conciliadoDest);
        this.conciliadoDest = conciliadoDest;
   }

   public Timestamp getDhConciliacao() {
        return dhConciliacao;
   }

   public void setDhConciliacao(Timestamp dhConciliacao) {
        markAsChanged("DHCONCILIACAO", dhConciliacao);
        this.dhConciliacao = dhConciliacao;
   }

   public Timestamp getDhTipOper() {
        return dhTipOper;
   }

   public void setDhTipOper(Timestamp dhTipOper) {
        markAsChanged("DHTIPOPER", dhTipOper);
        this.dhTipOper = dhTipOper;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
        this.dtAlter = dtAlter;
   }

   public Timestamp getDtContab() {
        return dtContab;
   }

   public void setDtContab(Timestamp dtContab) {
        markAsChanged("DTCONTAB", dtContab);
        this.dtContab = dtContab;
   }

   public Timestamp getDtInclusao() {
        return dtInclusao;
   }

   public void setDtInclusao(Timestamp dtInclusao) {
        markAsChanged("DTINCLUSAO", dtInclusao);
        this.dtInclusao = dtInclusao;
   }

   public Timestamp getDtLanc() {
        return dtLanc;
   }

   public void setDtLanc(Timestamp dtLanc) {
        markAsChanged("DTLANC", dtLanc);
        this.dtLanc = dtLanc;
   }

   public String getHistorico() {
        return historico;
   }

   public void setHistorico(String historico) {
        markAsChanged("HISTORICO", historico);
        this.historico = historico;
   }

   public BigDecimal getNuBco() {
        return nuBco;
   }

   public void setNuBco(BigDecimal nuBco) {
        markAsChanged("NUBCO", nuBco);
        this.nuBco = nuBco;
   }

   public BigDecimal getNuBcoCp() {
        return nuBcoCp;
   }

   public void setNuBcoCp(BigDecimal nuBcoCp) {
        markAsChanged("NUBCOCP", nuBcoCp);
        this.nuBcoCp = nuBcoCp;
   }

   public BigDecimal getNumDoc() {
        return numDoc;
   }

   public void setNumDoc(BigDecimal numDoc) {
        markAsChanged("NUMDOC", numDoc);
        this.numDoc = numDoc;
   }

   public BigDecimal getNumTransf() {
        return numTransf;
   }

   public void setNumTransf(BigDecimal numTransf) {
        markAsChanged("NUMTRANSF", numTransf);
        this.numTransf = numTransf;
   }

   public String getOrigMov() {
        return origMov;
   }

   public void setOrigMov(String origMov) {
        markAsChanged("ORIGMOV", origMov);
        this.origMov = origMov;
   }

   public Timestamp getPreData() {
        return preData;
   }

   public void setPreData(Timestamp preData) {
        markAsChanged("PREDATA", preData);
        this.preData = preData;
   }

   public BigDecimal getRecDesp() {
        return recDesp;
   }

   public void setRecDesp(BigDecimal recDesp) {
        markAsChanged("RECDESP", recDesp);
        this.recDesp = recDesp;
   }

   public BigDecimal getSaldo() {
        return saldo;
   }

   public void setSaldo(BigDecimal saldo) {
        markAsChanged("SALDO", saldo);
        this.saldo = saldo;
   }

   public BigDecimal getTalao() {
        return talao;
   }

   public void setTalao(BigDecimal talao) {
        markAsChanged("TALAO", talao);
        this.talao = talao;
   }

   public BigDecimal getVlrCheque() {
        return vlrCheque;
   }

   public void setVlrCheque(BigDecimal vlrCheque) {
        markAsChanged("VLRCHEQUE", vlrCheque);
        this.vlrCheque = vlrCheque;
   }

   public BigDecimal getVlrLanc() {
        return vlrLanc;
   }

   public void setVlrLanc(BigDecimal vlrLanc) {
        markAsChanged("VLRLANC", vlrLanc);
        this.vlrLanc = vlrLanc;
   }

   public BigDecimal getVlrLancDestino() {
        return vlrLancDestino;
   }

   public void setVlrLancDestino(BigDecimal vlrLancDestino) {
        markAsChanged("VLRLANC_DESTINO", vlrLancDestino);
        this.vlrLancDestino = vlrLancDestino;
   }

   public BigDecimal getVlrMoeda() {
        return vlrMoeda;
   }

   public void setVlrMoeda(BigDecimal vlrMoeda) {
        markAsChanged("VLRMOEDA", vlrMoeda);
        this.vlrMoeda = vlrMoeda;
   }

   public BigDecimal getVlrTroco() {
        return vlrTroco;
   }

   public void setVlrTroco(BigDecimal vlrTroco) {
        markAsChanged("VLRTROCO", vlrTroco);
        this.vlrTroco = vlrTroco;
   }

   public BigDecimal getCodPdv() {
        return codPdv;
   }

   public void setCodPdv(BigDecimal codPdv) {
        markAsChanged("CODPDV", codPdv);
        this.codPdv = codPdv;
   }

   public String getContabilizado() {
        return contabilizado;
   }

   public void setContabilizado(String contabilizado) {
        markAsChanged("CONTABILIZADO", contabilizado);
        this.contabilizado = contabilizado;
   }

   public BigDecimal getNroImport() {
        return nroImport;
   }

   public void setNroImport(BigDecimal nroImport) {
        markAsChanged("NROIMPORT", nroImport);
        this.nroImport = nroImport;
   }

   public BigDecimal getNuCaixa() {
        return nuCaixa;
   }

   public void setNuCaixa(BigDecimal nuCaixa) {
        markAsChanged("NUCAIXA", nuCaixa);
        this.nuCaixa = nuCaixa;
   }

   @Override
   public String getTableName() {
        return "TGFMBC";
   }

   @Override
   public String getEntityName() {
        return "MovimentoBancario";
   }

   @Override
   public MovimentoBancario fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codCtabcoContra = vo.asBigDecimal("CODCTABCOCONTRA");
        this.codCtabcoInt = vo.asBigDecimal("CODCTABCOINT");
        this.codCtabcoIntDest = vo.asBigDecimal("CODCTABCOINTDEST");
        this.codLanc = vo.asBigDecimal("CODLANC");
        this.codLancDest = vo.asBigDecimal("CODLANCDEST");
        this.codTipOper = vo.asBigDecimal("CODTIPOPER");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.conciliado = vo.asString("CONCILIADO");
        this.conciliadoDest = vo.asString("CONCILIADODEST");
        this.dhConciliacao = vo.asTimestamp("DHCONCILIACAO");
        this.dhTipOper = vo.asTimestamp("DHTIPOPER");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.dtContab = vo.asTimestamp("DTCONTAB");
        this.dtInclusao = vo.asTimestamp("DTINCLUSAO");
        this.dtLanc = vo.asTimestamp("DTLANC");
        this.historico = vo.asString("HISTORICO");
        this.nuBco = vo.asBigDecimal("NUBCO");
        this.nuBcoCp = vo.asBigDecimal("NUBCOCP");
        this.numDoc = vo.asBigDecimal("NUMDOC");
        this.numTransf = vo.asBigDecimal("NUMTRANSF");
        this.origMov = vo.asString("ORIGMOV");
        this.preData = vo.asTimestamp("PREDATA");
        this.recDesp = vo.asBigDecimal("RECDESP");
        this.saldo = vo.asBigDecimal("SALDO");
        this.talao = vo.asBigDecimal("TALAO");
        this.vlrCheque = vo.asBigDecimal("VLRCHEQUE");
        this.vlrLanc = vo.asBigDecimal("VLRLANC");
        this.vlrLancDestino = vo.asBigDecimal("VLRLANC_DESTINO");
        this.vlrMoeda = vo.asBigDecimal("VLRMOEDA");
        this.vlrTroco = vo.asBigDecimal("VLRTROCO");
        this.codPdv = vo.asBigDecimal("CODPDV");
        this.contabilizado = vo.asString("CONTABILIZADO");
        this.nroImport = vo.asBigDecimal("NROIMPORT");
        this.nuCaixa = vo.asBigDecimal("NUCAIXA");
        return this;
   }
}
