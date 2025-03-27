package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PortariaCat42 extends AbstractSankhyaEntity<PortariaCat42> {
   public BigDecimal getVlrTotRessarcimento() {
        return this.getVo().asBigDecimal("VLR_TOT_RESSARCIMENTO");
   }

   public void setVlrTotRessarcimento(BigDecimal vlrTotRessarcimento) {
        markAsChanged("VLR_TOT_RESSARCIMENTO", vlrTotRessarcimento);
   }

   public String getArqConfirmado() {
        return this.getVo().asString("ARQCONFIRMADO");
   }

   public void setArqConfirmado(String arqConfirmado) {
        markAsChanged("ARQCONFIRMADO", arqConfirmado);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public String getConsFilTronativo() {
        return this.getVo().asString("CONSFILTRONATIVO");
   }

   public void setConsFilTronativo(String consFilTronativo) {
        markAsChanged("CONSFILTRONATIVO", consFilTronativo);
   }

   public String getConsMarcGruprod() {
        return this.getVo().asString("CONSMARCGRUPROD");
   }

   public void setConsMarcGruprod(String consMarcGruprod) {
        markAsChanged("CONSMARCGRUPROD", consMarcGruprod);
   }

   public String getConsMarcProd() {
        return this.getVo().asString("CONSMARCPROD");
   }

   public void setConsMarcProd(String consMarcProd) {
        markAsChanged("CONSMARCPROD", consMarcProd);
   }

   public Timestamp getDtFinal() {
        return this.getVo().asTimestamp("DTFINAL");
   }

   public void setDtFinal(Timestamp dtFinal) {
        markAsChanged("DTFINAL", dtFinal);
   }

   public Timestamp getDtInicial() {
        return this.getVo().asTimestamp("DTINICIAL");
   }

   public void setDtInicial(Timestamp dtInicial) {
        markAsChanged("DTINICIAL", dtInicial);
   }

   public String getFilPersonalizado() {
        return this.getVo().asString("FILPERSONALIZADO");
   }

   public void setFilPersonalizado(String filPersonalizado) {
        markAsChanged("FILPERSONALIZADO", filPersonalizado);
   }

   public BigDecimal getFinApresentacao() {
        return this.getVo().asBigDecimal("FINAPRESENTACAO");
   }

   public void setFinApresentacao(BigDecimal finApresentacao) {
        markAsChanged("FINAPRESENTACAO", finApresentacao);
   }

   public String getTemDivergencia() {
        return this.getVo().asString("TEMDIVERGENCIA");
   }

   public void setTemDivergencia(String temDivergencia) {
        markAsChanged("TEMDIVERGENCIA", temDivergencia);
   }

   public BigDecimal getTipApur() {
        return this.getVo().asBigDecimal("TIPAPUR");
   }

   public void setTipApur(BigDecimal tipApur) {
        markAsChanged("TIPAPUR", tipApur);
   }

   public String getUsaVlrOrigSaldev() {
        return this.getVo().asString("USAVLRORIGSALDEV");
   }

   public void setUsaVlrOrigSaldev(String usaVlrOrigSaldev) {
        markAsChanged("USAVLRORIGSALDEV", usaVlrOrigSaldev);
   }

   public BigDecimal getVersaoLayout() {
        return this.getVo().asBigDecimal("VERSAOLAYOUT");
   }

   public void setVersaoLayout(BigDecimal versaoLayout) {
        markAsChanged("VERSAOLAYOUT", versaoLayout);
   }

   public BigDecimal getTotIcmsCredOperPropria() {
        return this.getVo().asBigDecimal("TOT_ICMS_CRED_OPER_PROPRIA");
   }

   public void setTotIcmsCredOperPropria(BigDecimal totIcmsCredOperPropria) {
        markAsChanged("TOT_ICMS_CRED_OPER_PROPRIA", totIcmsCredOperPropria);
   }

   public BigDecimal getVlrTotComplemento() {
        return this.getVo().asBigDecimal("VLR_TOT_COMPLEMENTO");
   }

   public void setVlrTotComplemento(BigDecimal vlrTotComplemento) {
        markAsChanged("VLR_TOT_COMPLEMENTO", vlrTotComplemento);
   }

   @Override
   public String getTableName() {
        return "TGFCAT42";
   }

   @Override
   public String getEntityName() {
        return "PortariaCat42";
   }

   @Override
   public PortariaCat42 fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
