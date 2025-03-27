package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class NotaConhecimentoTransporte extends AbstractSankhyaEntity<NotaConhecimentoTransporte> {
   public BigDecimal getCodModDoc() {
        return this.getVo().asBigDecimal("CODMODDOC");
   }

   public void setCodModDoc(BigDecimal codModDoc) {
        markAsChanged("CODMODDOC", codModDoc);
   }

   public Timestamp getDtEmissao() {
        return this.getVo().asTimestamp("DTEMISSAO");
   }

   public void setDtEmissao(Timestamp dtEmissao) {
        markAsChanged("DTEMISSAO", dtEmissao);
   }

   public String getNumero() {
        return this.getVo().asString("NUMERO");
   }

   public void setNumero(String numero) {
        markAsChanged("NUMERO", numero);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public String getSerie() {
        return this.getVo().asString("SERIE");
   }

   public void setSerie(String serie) {
        markAsChanged("SERIE", serie);
   }

   public BigDecimal getVlrNota() {
        return this.getVo().asBigDecimal("VLRNOTA");
   }

   public void setVlrNota(BigDecimal vlrNota) {
        markAsChanged("VLRNOTA", vlrNota);
   }

   public BigDecimal getBaseSt() {
        return this.getVo().asBigDecimal("BASEST");
   }

   public void setBaseSt(BigDecimal baseSt) {
        markAsChanged("BASEST", baseSt);
   }

   public BigDecimal getBaseIcms() {
        return this.getVo().asBigDecimal("BASEICMS");
   }

   public void setBaseIcms(BigDecimal baseIcms) {
        markAsChanged("BASEICMS", baseIcms);
   }

   public String getChaveNfe() {
        return this.getVo().asString("CHAVENFE");
   }

   public void setChaveNfe(String chaveNfe) {
        markAsChanged("CHAVENFE", chaveNfe);
   }

   public BigDecimal getVlrIcms() {
        return this.getVo().asBigDecimal("VLRICMS");
   }

   public void setVlrIcms(BigDecimal vlrIcms) {
        markAsChanged("VLRICMS", vlrIcms);
   }

   public BigDecimal getCfop() {
        return this.getVo().asBigDecimal("CFOP");
   }

   public void setCfop(BigDecimal cfop) {
        markAsChanged("CFOP", cfop);
   }

   public BigDecimal getVlrSt() {
        return this.getVo().asBigDecimal("VLRST");
   }

   public void setVlrSt(BigDecimal vlrSt) {
        markAsChanged("VLRST", vlrSt);
   }

   public BigDecimal getVlrTotProd() {
        return this.getVo().asBigDecimal("VLRTOTPROD");
   }

   public void setVlrTotProd(BigDecimal vlrTotProd) {
        markAsChanged("VLRTOTPROD", vlrTotProd);
   }

   public String getSegCodBar() {
        return this.getVo().asString("SEGCODBAR");
   }

   public void setSegCodBar(String segCodBar) {
        markAsChanged("SEGCODBAR", segCodBar);
   }

   public String getDescrDoc() {
        return this.getVo().asString("DESCRDOC");
   }

   public void setDescrDoc(String descrDoc) {
        markAsChanged("DESCRDOC", descrDoc);
   }

   public BigDecimal getPesoB() {
        return this.getVo().asBigDecimal("PESOB");
   }

   public void setPesoB(BigDecimal pesoB) {
        markAsChanged("PESOB", pesoB);
   }

   public BigDecimal getPesoL() {
        return this.getVo().asBigDecimal("PESOL");
   }

   public void setPesoL(BigDecimal pesoL) {
        markAsChanged("PESOL", pesoL);
   }

   @Override
   public String getTableName() {
        return "TGFNCT";
   }

   @Override
   public String getEntityName() {
        return "NotaConhecimentoTransporte";
   }

   @Override
   public NotaConhecimentoTransporte fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
