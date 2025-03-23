package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PortariaCat42 extends AbstractSankhyaEntity<PortariaCat42> {
   private BigDecimal vlrTotRessarcimento;
   private String arqConfirmado;
   private BigDecimal codEmp;
   private String consFilTronativo;
   private String consMarcGruprod;
   private String consMarcProd;
   private Timestamp dtFinal;
   private Timestamp dtInicial;
   private String filPersonalizado;
   private BigDecimal finApresentacao;
   private String temDivergencia;
   private BigDecimal tipApur;
   private String usaVlrOrigSaldev;
   private BigDecimal versaoLayout;
   private BigDecimal totIcmsCredOperPropria;
   private BigDecimal vlrTotComplemento;

   public BigDecimal getVlrTotRessarcimento() {
        return vlrTotRessarcimento;
   }

   public void setVlrTotRessarcimento(BigDecimal vlrTotRessarcimento) {
        markAsChanged("VLR_TOT_RESSARCIMENTO", vlrTotRessarcimento);
        this.vlrTotRessarcimento = vlrTotRessarcimento;
   }

   public String getArqConfirmado() {
        return arqConfirmado;
   }

   public void setArqConfirmado(String arqConfirmado) {
        markAsChanged("ARQCONFIRMADO", arqConfirmado);
        this.arqConfirmado = arqConfirmado;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public String getConsFilTronativo() {
        return consFilTronativo;
   }

   public void setConsFilTronativo(String consFilTronativo) {
        markAsChanged("CONSFILTRONATIVO", consFilTronativo);
        this.consFilTronativo = consFilTronativo;
   }

   public String getConsMarcGruprod() {
        return consMarcGruprod;
   }

   public void setConsMarcGruprod(String consMarcGruprod) {
        markAsChanged("CONSMARCGRUPROD", consMarcGruprod);
        this.consMarcGruprod = consMarcGruprod;
   }

   public String getConsMarcProd() {
        return consMarcProd;
   }

   public void setConsMarcProd(String consMarcProd) {
        markAsChanged("CONSMARCPROD", consMarcProd);
        this.consMarcProd = consMarcProd;
   }

   public Timestamp getDtFinal() {
        return dtFinal;
   }

   public void setDtFinal(Timestamp dtFinal) {
        markAsChanged("DTFINAL", dtFinal);
        this.dtFinal = dtFinal;
   }

   public Timestamp getDtInicial() {
        return dtInicial;
   }

   public void setDtInicial(Timestamp dtInicial) {
        markAsChanged("DTINICIAL", dtInicial);
        this.dtInicial = dtInicial;
   }

   public String getFilPersonalizado() {
        return filPersonalizado;
   }

   public void setFilPersonalizado(String filPersonalizado) {
        markAsChanged("FILPERSONALIZADO", filPersonalizado);
        this.filPersonalizado = filPersonalizado;
   }

   public BigDecimal getFinApresentacao() {
        return finApresentacao;
   }

   public void setFinApresentacao(BigDecimal finApresentacao) {
        markAsChanged("FINAPRESENTACAO", finApresentacao);
        this.finApresentacao = finApresentacao;
   }

   public String getTemDivergencia() {
        return temDivergencia;
   }

   public void setTemDivergencia(String temDivergencia) {
        markAsChanged("TEMDIVERGENCIA", temDivergencia);
        this.temDivergencia = temDivergencia;
   }

   public BigDecimal getTipApur() {
        return tipApur;
   }

   public void setTipApur(BigDecimal tipApur) {
        markAsChanged("TIPAPUR", tipApur);
        this.tipApur = tipApur;
   }

   public String getUsaVlrOrigSaldev() {
        return usaVlrOrigSaldev;
   }

   public void setUsaVlrOrigSaldev(String usaVlrOrigSaldev) {
        markAsChanged("USAVLRORIGSALDEV", usaVlrOrigSaldev);
        this.usaVlrOrigSaldev = usaVlrOrigSaldev;
   }

   public BigDecimal getVersaoLayout() {
        return versaoLayout;
   }

   public void setVersaoLayout(BigDecimal versaoLayout) {
        markAsChanged("VERSAOLAYOUT", versaoLayout);
        this.versaoLayout = versaoLayout;
   }

   public BigDecimal getTotIcmsCredOperPropria() {
        return totIcmsCredOperPropria;
   }

   public void setTotIcmsCredOperPropria(BigDecimal totIcmsCredOperPropria) {
        markAsChanged("TOT_ICMS_CRED_OPER_PROPRIA", totIcmsCredOperPropria);
        this.totIcmsCredOperPropria = totIcmsCredOperPropria;
   }

   public BigDecimal getVlrTotComplemento() {
        return vlrTotComplemento;
   }

   public void setVlrTotComplemento(BigDecimal vlrTotComplemento) {
        markAsChanged("VLR_TOT_COMPLEMENTO", vlrTotComplemento);
        this.vlrTotComplemento = vlrTotComplemento;
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
        this.vlrTotRessarcimento = vo.asBigDecimal("VLR_TOT_RESSARCIMENTO");
        this.arqConfirmado = vo.asString("ARQCONFIRMADO");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.consFilTronativo = vo.asString("CONSFILTRONATIVO");
        this.consMarcGruprod = vo.asString("CONSMARCGRUPROD");
        this.consMarcProd = vo.asString("CONSMARCPROD");
        this.dtFinal = vo.asTimestamp("DTFINAL");
        this.dtInicial = vo.asTimestamp("DTINICIAL");
        this.filPersonalizado = vo.asString("FILPERSONALIZADO");
        this.finApresentacao = vo.asBigDecimal("FINAPRESENTACAO");
        this.temDivergencia = vo.asString("TEMDIVERGENCIA");
        this.tipApur = vo.asBigDecimal("TIPAPUR");
        this.usaVlrOrigSaldev = vo.asString("USAVLRORIGSALDEV");
        this.versaoLayout = vo.asBigDecimal("VERSAOLAYOUT");
        this.totIcmsCredOperPropria = vo.asBigDecimal("TOT_ICMS_CRED_OPER_PROPRIA");
        this.vlrTotComplemento = vo.asBigDecimal("VLR_TOT_COMPLEMENTO");
        return this;
   }
}
