package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ObrigacoesICMSSTRecolher extends AbstractSankhyaEntity<ObrigacoesICMSSTRecolher> {
   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodObr() {
        return this.getVo().asBigDecimal("CODOBR");
   }

   public void setCodObr(BigDecimal codObr) {
        markAsChanged("CODOBR", codObr);
   }

   public String getCodRec() {
        return this.getVo().asString("CODREC");
   }

   public void setCodRec(String codRec) {
        markAsChanged("CODREC", codRec);
   }

   public BigDecimal getCodUf() {
        return this.getVo().asBigDecimal("CODUF");
   }

   public void setCodUf(BigDecimal codUf) {
        markAsChanged("CODUF", codUf);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getDescrCompl() {
        return this.getVo().asString("DESCRCOMPL");
   }

   public void setDescrCompl(String descrCompl) {
        markAsChanged("DESCRCOMPL", descrCompl);
   }

   public String getDescrProcesso() {
        return this.getVo().asString("DESCRPROCESSO");
   }

   public void setDescrProcesso(String descrProcesso) {
        markAsChanged("DESCRPROCESSO", descrProcesso);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public Timestamp getDtRef() {
        return this.getVo().asTimestamp("DTREF");
   }

   public void setDtRef(Timestamp dtRef) {
        markAsChanged("DTREF", dtRef);
   }

   public Timestamp getDtVcto() {
        return this.getVo().asTimestamp("DTVCTO");
   }

   public void setDtVcto(Timestamp dtVcto) {
        markAsChanged("DTVCTO", dtVcto);
   }

   public String getNumProcesso() {
        return this.getVo().asString("NUMPROCESSO");
   }

   public void setNumProcesso(String numProcesso) {
        markAsChanged("NUMPROCESSO", numProcesso);
   }

   public BigDecimal getOrigProcesso() {
        return this.getVo().asBigDecimal("ORIGPROCESSO");
   }

   public void setOrigProcesso(BigDecimal origProcesso) {
        markAsChanged("ORIGPROCESSO", origProcesso);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public String getTipApuracao() {
        return this.getVo().asString("TIPAPURACAO");
   }

   public void setTipApuracao(String tipApuracao) {
        markAsChanged("TIPAPURACAO", tipApuracao);
   }

   public BigDecimal getValor() {
        return this.getVo().asBigDecimal("VALOR");
   }

   public void setValor(BigDecimal valor) {
        markAsChanged("VALOR", valor);
   }

   public String getIndSubApuracao() {
        return this.getVo().asString("INDSUBAPURACAO");
   }

   public void setIndSubApuracao(String indSubApuracao) {
        markAsChanged("INDSUBAPURACAO", indSubApuracao);
   }

   public BigDecimal getCodClsVencDime() {
        return this.getVo().asBigDecimal("CODCLSVENCDIME");
   }

   public void setCodClsVencDime(BigDecimal codClsVencDime) {
        markAsChanged("CODCLSVENCDIME", codClsVencDime);
   }

   public String getCodRecDime() {
        return this.getVo().asString("CODRECDIME");
   }

   public void setCodRecDime(String codRecDime) {
        markAsChanged("CODRECDIME", codRecDime);
   }

   @Override
   public String getTableName() {
        return "TGFOIR";
   }

   @Override
   public String getEntityName() {
        return "ObrigacoesICMSSTRecolher";
   }

   @Override
   public ObrigacoesICMSSTRecolher fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
