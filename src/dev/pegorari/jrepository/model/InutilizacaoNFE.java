package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class InutilizacaoNFE extends AbstractSankhyaEntity<InutilizacaoNFE> {
   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodModDoc() {
        return this.getVo().asBigDecimal("CODMODDOC");
   }

   public void setCodModDoc(BigDecimal codModDoc) {
        markAsChanged("CODMODDOC", codModDoc);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDhProtoc() {
        return this.getVo().asTimestamp("DHPROTOC");
   }

   public void setDhProtoc(Timestamp dhProtoc) {
        markAsChanged("DHPROTOC", dhProtoc);
   }

   public Timestamp getDtMov() {
        return this.getVo().asTimestamp("DTMOV");
   }

   public void setDtMov(Timestamp dtMov) {
        markAsChanged("DTMOV", dtMov);
   }

   public String getMotivo() {
        return this.getVo().asString("MOTIVO");
   }

   public void setMotivo(String motivo) {
        markAsChanged("MOTIVO", motivo);
   }

   public BigDecimal getNumNota() {
        return this.getVo().asBigDecimal("NUMNOTA");
   }

   public void setNumNota(BigDecimal numNota) {
        markAsChanged("NUMNOTA", numNota);
   }

   public String getNumProtoc() {
        return this.getVo().asString("NUMPROTOC");
   }

   public void setNumProtoc(String numProtoc) {
        markAsChanged("NUMPROTOC", numProtoc);
   }

   public String getSerieNota() {
        return this.getVo().asString("SERIENOTA");
   }

   public void setSerieNota(String serieNota) {
        markAsChanged("SERIENOTA", serieNota);
   }

   public String getEntSai() {
        return this.getVo().asString("ENTSAI");
   }

   public void setEntSai(String entSai) {
        markAsChanged("ENTSAI", entSai);
   }

   public String getTpAmbNfe() {
        return this.getVo().asString("TPAMBNFE");
   }

   public void setTpAmbNfe(String tpAmbNfe) {
        markAsChanged("TPAMBNFE", tpAmbNfe);
   }

   @Override
   public String getTableName() {
        return "TGFINU";
   }

   @Override
   public String getEntityName() {
        return "InutilizacaoNFE";
   }

   @Override
   public InutilizacaoNFE fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
