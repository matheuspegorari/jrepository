package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PortariaCat42 implements SankhyaEntity<PortariaCat42> {

   private BigDecimal vlrTotRessarcimento;
   private String arqConfirmado;
   private BigDecimal codEmp;
   private String consFilTroNativo;
   private String consMarcGrupRod;
   private String consMarcProd;
   private Timestamp dtFinal;
   private Timestamp dtInicial;
   private String filPersonalizado;
   private BigDecimal finApresentacao;
   private String temDivergencia;
   private BigDecimal tipApur;
   private String usaVlrOrigSalDev;
   private BigDecimal versaoLayout;
   private BigDecimal totIcmsCredOperPropria;
   private BigDecimal vlrTotComplemento;

   public BigDecimal getVlrTotRessarcimento() {
        return vlrTotRessarcimento;
   }

   public void setVlrTotRessarcimento(BigDecimal vlrTotRessarcimento) {
        this.vlrTotRessarcimento = vlrTotRessarcimento;
   }

   public String getArqConfirmado() {
        return arqConfirmado;
   }

   public void setArqConfirmado(String arqConfirmado) {
        this.arqConfirmado = arqConfirmado;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public String getConsFilTroNativo() {
        return consFilTroNativo;
   }

   public void setConsFilTroNativo(String consFilTroNativo) {
        this.consFilTroNativo = consFilTroNativo;
   }

   public String getConsMarcGrupRod() {
        return consMarcGrupRod;
   }

   public void setConsMarcGrupRod(String consMarcGrupRod) {
        this.consMarcGrupRod = consMarcGrupRod;
   }

   public String getConsMarcProd() {
        return consMarcProd;
   }

   public void setConsMarcProd(String consMarcProd) {
        this.consMarcProd = consMarcProd;
   }

   public Timestamp getDtFinal() {
        return dtFinal;
   }

   public void setDtFinal(Timestamp dtFinal) {
        this.dtFinal = dtFinal;
   }

   public Timestamp getDtInicial() {
        return dtInicial;
   }

   public void setDtInicial(Timestamp dtInicial) {
        this.dtInicial = dtInicial;
   }

   public String getFilPersonalizado() {
        return filPersonalizado;
   }

   public void setFilPersonalizado(String filPersonalizado) {
        this.filPersonalizado = filPersonalizado;
   }

   public BigDecimal getFinApresentacao() {
        return finApresentacao;
   }

   public void setFinApresentacao(BigDecimal finApresentacao) {
        this.finApresentacao = finApresentacao;
   }

   public String getTemDivergencia() {
        return temDivergencia;
   }

   public void setTemDivergencia(String temDivergencia) {
        this.temDivergencia = temDivergencia;
   }

   public BigDecimal getTipApur() {
        return tipApur;
   }

   public void setTipApur(BigDecimal tipApur) {
        this.tipApur = tipApur;
   }

   public String getUsaVlrOrigSalDev() {
        return usaVlrOrigSalDev;
   }

   public void setUsaVlrOrigSalDev(String usaVlrOrigSalDev) {
        this.usaVlrOrigSalDev = usaVlrOrigSalDev;
   }

   public BigDecimal getVersaoLayout() {
        return versaoLayout;
   }

   public void setVersaoLayout(BigDecimal versaoLayout) {
        this.versaoLayout = versaoLayout;
   }

   public BigDecimal getTotIcmsCredOperPropria() {
        return totIcmsCredOperPropria;
   }

   public void setTotIcmsCredOperPropria(BigDecimal totIcmsCredOperPropria) {
        this.totIcmsCredOperPropria = totIcmsCredOperPropria;
   }

   public BigDecimal getVlrTotComplemento() {
        return vlrTotComplemento;
   }

   public void setVlrTotComplemento(BigDecimal vlrTotComplemento) {
        this.vlrTotComplemento = vlrTotComplemento;
   }

   @Override
   public String getEntityName() {
        return "PortariaCat42";
   }

   @Override
   public PortariaCat42 fromVO(DynamicVO vo) {
        this.vlrTotRessarcimento = vo.asBigDecimal("VLRTOTRESSARCIMENTO");
        this.arqConfirmado = vo.asString("ARQCONFIRMADO");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.consFilTroNativo = vo.asString("CONSFILTRONATIVO");
        this.consMarcGrupRod = vo.asString("CONSMARCGRUPROD");
        this.consMarcProd = vo.asString("CONSMARCPROD");
        this.dtFinal = vo.asTimestamp("DTFINAL");
        this.dtInicial = vo.asTimestamp("DTINICIAL");
        this.filPersonalizado = vo.asString("FILPERSONALIZADO");
        this.finApresentacao = vo.asBigDecimal("FINAPRESENTACAO");
        this.temDivergencia = vo.asString("TEMDIVERGENCIA");
        this.tipApur = vo.asBigDecimal("TIPAPUR");
        this.usaVlrOrigSalDev = vo.asString("USAVLRORIGSALDEV");
        this.versaoLayout = vo.asBigDecimal("VERSAOLAYOUT");
        this.totIcmsCredOperPropria = vo.asBigDecimal("TOTICMSCREDOPERPROPRIA");
        this.vlrTotComplemento = vo.asBigDecimal("VLRTOTCOMPLEMENTO");
        return this;
   }
}
