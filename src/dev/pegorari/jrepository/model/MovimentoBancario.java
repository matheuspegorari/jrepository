package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class MovimentoBancario extends AbstractSankhyaEntity<MovimentoBancario> {
   public BigDecimal getCodCtabcoContra() {
        return this.getVo().asBigDecimal("CODCTABCOCONTRA");
   }

   public void setCodCtabcoContra(BigDecimal codCtabcoContra) {
        markAsChanged("CODCTABCOCONTRA", codCtabcoContra);
   }

   public BigDecimal getCodCtabcoInt() {
        return this.getVo().asBigDecimal("CODCTABCOINT");
   }

   public void setCodCtabcoInt(BigDecimal codCtabcoInt) {
        markAsChanged("CODCTABCOINT", codCtabcoInt);
   }

   public BigDecimal getCodCtabcoIntDest() {
        return this.getVo().asBigDecimal("CODCTABCOINTDEST");
   }

   public void setCodCtabcoIntDest(BigDecimal codCtabcoIntDest) {
        markAsChanged("CODCTABCOINTDEST", codCtabcoIntDest);
   }

   public BigDecimal getCodLanc() {
        return this.getVo().asBigDecimal("CODLANC");
   }

   public void setCodLanc(BigDecimal codLanc) {
        markAsChanged("CODLANC", codLanc);
   }

   public BigDecimal getCodLancDest() {
        return this.getVo().asBigDecimal("CODLANCDEST");
   }

   public void setCodLancDest(BigDecimal codLancDest) {
        markAsChanged("CODLANCDEST", codLancDest);
   }

   public BigDecimal getCodTipOper() {
        return this.getVo().asBigDecimal("CODTIPOPER");
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        markAsChanged("CODTIPOPER", codTipOper);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getConciliado() {
        return this.getVo().asString("CONCILIADO");
   }

   public void setConciliado(String conciliado) {
        markAsChanged("CONCILIADO", conciliado);
   }

   public String getConciliadoDest() {
        return this.getVo().asString("CONCILIADODEST");
   }

   public void setConciliadoDest(String conciliadoDest) {
        markAsChanged("CONCILIADODEST", conciliadoDest);
   }

   public Timestamp getDhConciliacao() {
        return this.getVo().asTimestamp("DHCONCILIACAO");
   }

   public void setDhConciliacao(Timestamp dhConciliacao) {
        markAsChanged("DHCONCILIACAO", dhConciliacao);
   }

   public Timestamp getDhTipOper() {
        return this.getVo().asTimestamp("DHTIPOPER");
   }

   public void setDhTipOper(Timestamp dhTipOper) {
        markAsChanged("DHTIPOPER", dhTipOper);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public Timestamp getDtContab() {
        return this.getVo().asTimestamp("DTCONTAB");
   }

   public void setDtContab(Timestamp dtContab) {
        markAsChanged("DTCONTAB", dtContab);
   }

   public Timestamp getDtInclusao() {
        return this.getVo().asTimestamp("DTINCLUSAO");
   }

   public void setDtInclusao(Timestamp dtInclusao) {
        markAsChanged("DTINCLUSAO", dtInclusao);
   }

   public Timestamp getDtLanc() {
        return this.getVo().asTimestamp("DTLANC");
   }

   public void setDtLanc(Timestamp dtLanc) {
        markAsChanged("DTLANC", dtLanc);
   }

   public String getHistorico() {
        return this.getVo().asString("HISTORICO");
   }

   public void setHistorico(String historico) {
        markAsChanged("HISTORICO", historico);
   }

   public BigDecimal getNuBco() {
        return this.getVo().asBigDecimal("NUBCO");
   }

   public void setNuBco(BigDecimal nuBco) {
        markAsChanged("NUBCO", nuBco);
   }

   public BigDecimal getNuBcoCp() {
        return this.getVo().asBigDecimal("NUBCOCP");
   }

   public void setNuBcoCp(BigDecimal nuBcoCp) {
        markAsChanged("NUBCOCP", nuBcoCp);
   }

   public BigDecimal getNumDoc() {
        return this.getVo().asBigDecimal("NUMDOC");
   }

   public void setNumDoc(BigDecimal numDoc) {
        markAsChanged("NUMDOC", numDoc);
   }

   public BigDecimal getNumTransf() {
        return this.getVo().asBigDecimal("NUMTRANSF");
   }

   public void setNumTransf(BigDecimal numTransf) {
        markAsChanged("NUMTRANSF", numTransf);
   }

   public String getOrigMov() {
        return this.getVo().asString("ORIGMOV");
   }

   public void setOrigMov(String origMov) {
        markAsChanged("ORIGMOV", origMov);
   }

   public Timestamp getPreData() {
        return this.getVo().asTimestamp("PREDATA");
   }

   public void setPreData(Timestamp preData) {
        markAsChanged("PREDATA", preData);
   }

   public BigDecimal getRecDesp() {
        return this.getVo().asBigDecimal("RECDESP");
   }

   public void setRecDesp(BigDecimal recDesp) {
        markAsChanged("RECDESP", recDesp);
   }

   public BigDecimal getSaldo() {
        return this.getVo().asBigDecimal("SALDO");
   }

   public void setSaldo(BigDecimal saldo) {
        markAsChanged("SALDO", saldo);
   }

   public BigDecimal getTalao() {
        return this.getVo().asBigDecimal("TALAO");
   }

   public void setTalao(BigDecimal talao) {
        markAsChanged("TALAO", talao);
   }

   public BigDecimal getVlrCheque() {
        return this.getVo().asBigDecimal("VLRCHEQUE");
   }

   public void setVlrCheque(BigDecimal vlrCheque) {
        markAsChanged("VLRCHEQUE", vlrCheque);
   }

   public BigDecimal getVlrLanc() {
        return this.getVo().asBigDecimal("VLRLANC");
   }

   public void setVlrLanc(BigDecimal vlrLanc) {
        markAsChanged("VLRLANC", vlrLanc);
   }

   public BigDecimal getVlrLancDestino() {
        return this.getVo().asBigDecimal("VLRLANC_DESTINO");
   }

   public void setVlrLancDestino(BigDecimal vlrLancDestino) {
        markAsChanged("VLRLANC_DESTINO", vlrLancDestino);
   }

   public BigDecimal getVlrMoeda() {
        return this.getVo().asBigDecimal("VLRMOEDA");
   }

   public void setVlrMoeda(BigDecimal vlrMoeda) {
        markAsChanged("VLRMOEDA", vlrMoeda);
   }

   public BigDecimal getVlrTroco() {
        return this.getVo().asBigDecimal("VLRTROCO");
   }

   public void setVlrTroco(BigDecimal vlrTroco) {
        markAsChanged("VLRTROCO", vlrTroco);
   }

   public BigDecimal getCodPdv() {
        return this.getVo().asBigDecimal("CODPDV");
   }

   public void setCodPdv(BigDecimal codPdv) {
        markAsChanged("CODPDV", codPdv);
   }

   public String getContabilizado() {
        return this.getVo().asString("CONTABILIZADO");
   }

   public void setContabilizado(String contabilizado) {
        markAsChanged("CONTABILIZADO", contabilizado);
   }

   public BigDecimal getNroImport() {
        return this.getVo().asBigDecimal("NROIMPORT");
   }

   public void setNroImport(BigDecimal nroImport) {
        markAsChanged("NROIMPORT", nroImport);
   }

   public BigDecimal getNuCaixa() {
        return this.getVo().asBigDecimal("NUCAIXA");
   }

   public void setNuCaixa(BigDecimal nuCaixa) {
        markAsChanged("NUCAIXA", nuCaixa);
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
        this.setVo(vo);
        return this;
   }
}
