package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class BoletoRapido extends AbstractSankhyaEntity<BoletoRapido> {
   private BigDecimal codCtabCoint;
   private BigDecimal codParc;
   private Timestamp dtCred;
   private Timestamp dtPag;
   private Timestamp dtVenc;
   private BigDecimal idUnico;
   private BigDecimal idUniorig;
   private String linkBoleto;
   private String linkGrupo;
   private String linkInfo;
   private BigDecimal nmPedido;
   private String nmToken;
   private BigDecimal nossoNumor;
   private String numBanco;
   private String sitRegBol;
   private String status;
   private BigDecimal vrBoleto;
   private BigDecimal vrLiquido;
   private BigDecimal vrPago;
   private BigDecimal vrTarifa;

   public BigDecimal getCodCtabCoint() {
        return codCtabCoint;
   }

   public void setCodCtabCoint(BigDecimal codCtabCoint) {
        this.codCtabCoint = codCtabCoint;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
   }

   public Timestamp getDtCred() {
        return dtCred;
   }

   public void setDtCred(Timestamp dtCred) {
        this.dtCred = dtCred;
   }

   public Timestamp getDtPag() {
        return dtPag;
   }

   public void setDtPag(Timestamp dtPag) {
        this.dtPag = dtPag;
   }

   public Timestamp getDtVenc() {
        return dtVenc;
   }

   public void setDtVenc(Timestamp dtVenc) {
        this.dtVenc = dtVenc;
   }

   public BigDecimal getIdUnico() {
        return idUnico;
   }

   public void setIdUnico(BigDecimal idUnico) {
        this.idUnico = idUnico;
   }

   public BigDecimal getIdUniorig() {
        return idUniorig;
   }

   public void setIdUniorig(BigDecimal idUniorig) {
        this.idUniorig = idUniorig;
   }

   public String getLinkBoleto() {
        return linkBoleto;
   }

   public void setLinkBoleto(String linkBoleto) {
        this.linkBoleto = linkBoleto;
   }

   public String getLinkGrupo() {
        return linkGrupo;
   }

   public void setLinkGrupo(String linkGrupo) {
        this.linkGrupo = linkGrupo;
   }

   public String getLinkInfo() {
        return linkInfo;
   }

   public void setLinkInfo(String linkInfo) {
        this.linkInfo = linkInfo;
   }

   public BigDecimal getNmPedido() {
        return nmPedido;
   }

   public void setNmPedido(BigDecimal nmPedido) {
        this.nmPedido = nmPedido;
   }

   public String getNmToken() {
        return nmToken;
   }

   public void setNmToken(String nmToken) {
        this.nmToken = nmToken;
   }

   public BigDecimal getNossoNumor() {
        return nossoNumor;
   }

   public void setNossoNumor(BigDecimal nossoNumor) {
        this.nossoNumor = nossoNumor;
   }

   public String getNumBanco() {
        return numBanco;
   }

   public void setNumBanco(String numBanco) {
        this.numBanco = numBanco;
   }

   public String getSitRegBol() {
        return sitRegBol;
   }

   public void setSitRegBol(String sitRegBol) {
        this.sitRegBol = sitRegBol;
   }

   public String getStatus() {
        return status;
   }

   public void setStatus(String status) {
        this.status = status;
   }

   public BigDecimal getVrBoleto() {
        return vrBoleto;
   }

   public void setVrBoleto(BigDecimal vrBoleto) {
        this.vrBoleto = vrBoleto;
   }

   public BigDecimal getVrLiquido() {
        return vrLiquido;
   }

   public void setVrLiquido(BigDecimal vrLiquido) {
        this.vrLiquido = vrLiquido;
   }

   public BigDecimal getVrPago() {
        return vrPago;
   }

   public void setVrPago(BigDecimal vrPago) {
        this.vrPago = vrPago;
   }

   public BigDecimal getVrTarifa() {
        return vrTarifa;
   }

   public void setVrTarifa(BigDecimal vrTarifa) {
        this.vrTarifa = vrTarifa;
   }

   @Override
   public String getTableName() {
        return "TGFPJB";
   }

   @Override
   public String getEntityName() {
        return "BoletoRapido";
   }

   @Override
   public BoletoRapido fromVO(DynamicVO vo) {
        this.codCtabCoint = vo.asBigDecimal("CODCTABCOINT");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.dtCred = vo.asTimestamp("DTCRED");
        this.dtPag = vo.asTimestamp("DTPAG");
        this.dtVenc = vo.asTimestamp("DTVENC");
        this.idUnico = vo.asBigDecimal("IDUNICO");
        this.idUniorig = vo.asBigDecimal("IDUNIORIG");
        this.linkBoleto = vo.asString("LINKBOLETO");
        this.linkGrupo = vo.asString("LINKGRUPO");
        this.linkInfo = vo.asString("LINKINFO");
        this.nmPedido = vo.asBigDecimal("NMPEDIDO");
        this.nmToken = vo.asString("NMTOKEN");
        this.nossoNumor = vo.asBigDecimal("NOSSONUMOR");
        this.numBanco = vo.asString("NUMBANCO");
        this.sitRegBol = vo.asString("SITREGBOL");
        this.status = vo.asString("STATUS");
        this.vrBoleto = vo.asBigDecimal("VRBOLETO");
        this.vrLiquido = vo.asBigDecimal("VRLIQUIDO");
        this.vrPago = vo.asBigDecimal("VRPAGO");
        this.vrTarifa = vo.asBigDecimal("VRTARIFA");
        return this;
   }
}
