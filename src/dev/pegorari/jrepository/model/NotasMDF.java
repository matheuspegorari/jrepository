package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class NotasMDF extends AbstractSankhyaEntity<NotasMDF> {
   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getNumNota() {
        return this.getVo().asBigDecimal("NUMNOTA");
   }

   public void setNumNota(BigDecimal numNota) {
        markAsChanged("NUMNOTA", numNota);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getNuViag() {
        return this.getVo().asBigDecimal("NUVIAG");
   }

   public void setNuViag(BigDecimal nuViag) {
        markAsChanged("NUVIAG", nuViag);
   }

   public BigDecimal getOrdemCarga() {
        return this.getVo().asBigDecimal("ORDEMCARGA");
   }

   public void setOrdemCarga(BigDecimal ordemCarga) {
        markAsChanged("ORDEMCARGA", ordemCarga);
   }

   public BigDecimal getPesoBruto() {
        return this.getVo().asBigDecimal("PESOBRUTO");
   }

   public void setPesoBruto(BigDecimal pesoBruto) {
        markAsChanged("PESOBRUTO", pesoBruto);
   }

   public String getRazaoSocial() {
        return this.getVo().asString("RAZAOSOCIAL");
   }

   public void setRazaoSocial(String razaoSocial) {
        markAsChanged("RAZAOSOCIAL", razaoSocial);
   }

   public String getRazaoSocialParc() {
        return this.getVo().asString("RAZAOSOCIALPARC");
   }

   public void setRazaoSocialParc(String razaoSocialParc) {
        markAsChanged("RAZAOSOCIALPARC", razaoSocialParc);
   }

   public BigDecimal getSeqMdfe() {
        return this.getVo().asBigDecimal("SEQMDFE");
   }

   public void setSeqMdfe(BigDecimal seqMdfe) {
        markAsChanged("SEQMDFE", seqMdfe);
   }

   public BigDecimal getVlrNota() {
        return this.getVo().asBigDecimal("VLRNOTA");
   }

   public void setVlrNota(BigDecimal vlrNota) {
        markAsChanged("VLRNOTA", vlrNota);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public String getIndReentrega() {
        return this.getVo().asString("INDREENTREGA");
   }

   public void setIndReentrega(String indReentrega) {
        markAsChanged("INDREENTREGA", indReentrega);
   }

   public String getStatusEnvio() {
        return this.getVo().asString("STATUSENVIO");
   }

   public void setStatusEnvio(String statusEnvio) {
        markAsChanged("STATUSENVIO", statusEnvio);
   }

   @Override
   public String getTableName() {
        return "TGFNMDFE";
   }

   @Override
   public String getEntityName() {
        return "NotasMDF";
   }

   @Override
   public NotasMDF fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
