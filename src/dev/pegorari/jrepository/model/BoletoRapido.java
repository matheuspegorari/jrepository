package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class BoletoRapido extends AbstractSankhyaEntity<BoletoRapido> {
   public BigDecimal getCodCtabCoint() {
        return this.getVo().asBigDecimal("CODCTABCOINT");
   }

   public void setCodCtabCoint(BigDecimal codCtabCoint) {
        markAsChanged("CODCTABCOINT", codCtabCoint);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public Timestamp getDtCred() {
        return this.getVo().asTimestamp("DTCRED");
   }

   public void setDtCred(Timestamp dtCred) {
        markAsChanged("DTCRED", dtCred);
   }

   public Timestamp getDtPag() {
        return this.getVo().asTimestamp("DTPAG");
   }

   public void setDtPag(Timestamp dtPag) {
        markAsChanged("DTPAG", dtPag);
   }

   public Timestamp getDtVenc() {
        return this.getVo().asTimestamp("DTVENC");
   }

   public void setDtVenc(Timestamp dtVenc) {
        markAsChanged("DTVENC", dtVenc);
   }

   public BigDecimal getIdUnico() {
        return this.getVo().asBigDecimal("IDUNICO");
   }

   public void setIdUnico(BigDecimal idUnico) {
        markAsChanged("IDUNICO", idUnico);
   }

   public BigDecimal getIdUniorig() {
        return this.getVo().asBigDecimal("IDUNIORIG");
   }

   public void setIdUniorig(BigDecimal idUniorig) {
        markAsChanged("IDUNIORIG", idUniorig);
   }

   public String getLinkBoleto() {
        return this.getVo().asString("LINKBOLETO");
   }

   public void setLinkBoleto(String linkBoleto) {
        markAsChanged("LINKBOLETO", linkBoleto);
   }

   public String getLinkGrupo() {
        return this.getVo().asString("LINKGRUPO");
   }

   public void setLinkGrupo(String linkGrupo) {
        markAsChanged("LINKGRUPO", linkGrupo);
   }

   public String getLinkInfo() {
        return this.getVo().asString("LINKINFO");
   }

   public void setLinkInfo(String linkInfo) {
        markAsChanged("LINKINFO", linkInfo);
   }

   public BigDecimal getNmPedido() {
        return this.getVo().asBigDecimal("NMPEDIDO");
   }

   public void setNmPedido(BigDecimal nmPedido) {
        markAsChanged("NMPEDIDO", nmPedido);
   }

   public String getNmToken() {
        return this.getVo().asString("NMTOKEN");
   }

   public void setNmToken(String nmToken) {
        markAsChanged("NMTOKEN", nmToken);
   }

   public BigDecimal getNossoNumor() {
        return this.getVo().asBigDecimal("NOSSONUMOR");
   }

   public void setNossoNumor(BigDecimal nossoNumor) {
        markAsChanged("NOSSONUMOR", nossoNumor);
   }

   public String getNumBanco() {
        return this.getVo().asString("NUMBANCO");
   }

   public void setNumBanco(String numBanco) {
        markAsChanged("NUMBANCO", numBanco);
   }

   public String getSitRegBol() {
        return this.getVo().asString("SITREGBOL");
   }

   public void setSitRegBol(String sitRegBol) {
        markAsChanged("SITREGBOL", sitRegBol);
   }

   public String getStatus() {
        return this.getVo().asString("STATUS");
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
   }

   public BigDecimal getVrBoleto() {
        return this.getVo().asBigDecimal("VRBOLETO");
   }

   public void setVrBoleto(BigDecimal vrBoleto) {
        markAsChanged("VRBOLETO", vrBoleto);
   }

   public BigDecimal getVrLiquido() {
        return this.getVo().asBigDecimal("VRLIQUIDO");
   }

   public void setVrLiquido(BigDecimal vrLiquido) {
        markAsChanged("VRLIQUIDO", vrLiquido);
   }

   public BigDecimal getVrPago() {
        return this.getVo().asBigDecimal("VRPAGO");
   }

   public void setVrPago(BigDecimal vrPago) {
        markAsChanged("VRPAGO", vrPago);
   }

   public BigDecimal getVrTarifa() {
        return this.getVo().asBigDecimal("VRTARIFA");
   }

   public void setVrTarifa(BigDecimal vrTarifa) {
        markAsChanged("VRTARIFA", vrTarifa);
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
        this.setVo(vo);
        return this;
   }
}
