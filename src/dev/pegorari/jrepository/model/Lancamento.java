package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Lancamento extends AbstractSankhyaEntity<Lancamento> {
   public BigDecimal getCodCencus() {
        return this.getVo().asBigDecimal("CODCENCUS");
   }

   public void setCodCencus(BigDecimal codCencus) {
        markAsChanged("CODCENCUS", codCencus);
   }

   public BigDecimal getCodConPar() {
        return this.getVo().asBigDecimal("CODCONPAR");
   }

   public void setCodConPar(BigDecimal codConPar) {
        markAsChanged("CODCONPAR", codConPar);
   }

   public BigDecimal getCodCtaCtb() {
        return this.getVo().asBigDecimal("CODCTACTB");
   }

   public void setCodCtaCtb(BigDecimal codCtaCtb) {
        markAsChanged("CODCTACTB", codCtaCtb);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodHistCtb() {
        return this.getVo().asBigDecimal("CODHISTCTB");
   }

   public void setCodHistCtb(BigDecimal codHistCtb) {
        markAsChanged("CODHISTCTB", codHistCtb);
   }

   public BigDecimal getCodProj() {
        return this.getVo().asBigDecimal("CODPROJ");
   }

   public void setCodProj(BigDecimal codProj) {
        markAsChanged("CODPROJ", codProj);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getComplHist() {
        return this.getVo().asString("COMPLHIST");
   }

   public void setComplHist(String complHist) {
        markAsChanged("COMPLHIST", complHist);
   }

   public Timestamp getDtMov() {
        return this.getVo().asTimestamp("DTMOV");
   }

   public void setDtMov(Timestamp dtMov) {
        markAsChanged("DTMOV", dtMov);
   }

   public String getLiberado() {
        return this.getVo().asString("LIBERADO");
   }

   public void setLiberado(String liberado) {
        markAsChanged("LIBERADO", liberado);
   }

   public BigDecimal getNumDoc() {
        return this.getVo().asBigDecimal("NUMDOC");
   }

   public void setNumDoc(BigDecimal numDoc) {
        markAsChanged("NUMDOC", numDoc);
   }

   public BigDecimal getNumLanc() {
        return this.getVo().asBigDecimal("NUMLANC");
   }

   public void setNumLanc(BigDecimal numLanc) {
        markAsChanged("NUMLANC", numLanc);
   }

   public BigDecimal getNumLote() {
        return this.getVo().asBigDecimal("NUMLOTE");
   }

   public void setNumLote(BigDecimal numLote) {
        markAsChanged("NUMLOTE", numLote);
   }

   public Timestamp getReferencia() {
        return this.getVo().asTimestamp("REFERENCIA");
   }

   public void setReferencia(Timestamp referencia) {
        markAsChanged("REFERENCIA", referencia);
   }

   public String getTipLanc() {
        return this.getVo().asString("TIPLANC");
   }

   public void setTipLanc(String tipLanc) {
        markAsChanged("TIPLANC", tipLanc);
   }

   public Timestamp getVencimento() {
        return this.getVo().asTimestamp("VENCIMENTO");
   }

   public void setVencimento(Timestamp vencimento) {
        markAsChanged("VENCIMENTO", vencimento);
   }

   public BigDecimal getVlrCred() {
        return this.getVo().asBigDecimal("VLRCRED");
   }

   public void setVlrCred(BigDecimal vlrCred) {
        markAsChanged("VLRCRED", vlrCred);
   }

   public BigDecimal getVlrDeb() {
        return this.getVo().asBigDecimal("VLRDEB");
   }

   public void setVlrDeb(BigDecimal vlrDeb) {
        markAsChanged("VLRDEB", vlrDeb);
   }

   public BigDecimal getVlrLanc() {
        return this.getVo().asBigDecimal("VLRLANC");
   }

   public void setVlrLanc(BigDecimal vlrLanc) {
        markAsChanged("VLRLANC", vlrLanc);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public BigDecimal getCodEmpOrig() {
        return this.getVo().asBigDecimal("CODEMPORIG");
   }

   public void setCodEmpOrig(BigDecimal codEmpOrig) {
        markAsChanged("CODEMPORIG", codEmpOrig);
   }

   public Timestamp getDtExtemporaneo() {
        return this.getVo().asTimestamp("DTEXTEMPORANEO");
   }

   public void setDtExtemporaneo(Timestamp dtExtemporaneo) {
        markAsChanged("DTEXTEMPORANEO", dtExtemporaneo);
   }

   public String getExtemporaneo() {
        return this.getVo().asString("EXTEMPORANEO");
   }

   public void setExtemporaneo(String extemporaneo) {
        markAsChanged("EXTEMPORANEO", extemporaneo);
   }

   public String getPartLalurA() {
        return this.getVo().asString("PARTLALUR_A");
   }

   public void setPartLalurA(String partLalurA) {
        markAsChanged("PARTLALUR_A", partLalurA);
   }

   public String getChave() {
        return this.getVo().asString("CHAVE");
   }

   public void setChave(String chave) {
        markAsChanged("CHAVE", chave);
   }

   public String getConciliado() {
        return this.getVo().asString("CONCILIADO");
   }

   public void setConciliado(String conciliado) {
        markAsChanged("CONCILIADO", conciliado);
   }

   @Override
   public String getTableName() {
        return "TCBLAN";
   }

   @Override
   public String getEntityName() {
        return "Lancamento";
   }

   @Override
   public Lancamento fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
