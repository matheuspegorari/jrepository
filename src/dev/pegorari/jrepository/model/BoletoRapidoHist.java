package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class BoletoRapidoHist extends AbstractSankhyaEntity<BoletoRapidoHist> {
   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDtAlt() {
        return this.getVo().asTimestamp("DTALT");
   }

   public void setDtAlt(Timestamp dtAlt) {
        markAsChanged("DTALT", dtAlt);
   }

   public BigDecimal getIdUnico() {
        return this.getVo().asBigDecimal("IDUNICO");
   }

   public void setIdUnico(BigDecimal idUnico) {
        markAsChanged("IDUNICO", idUnico);
   }

   public String getMotivo() {
        return this.getVo().asString("MOTIVO");
   }

   public void setMotivo(String motivo) {
        markAsChanged("MOTIVO", motivo);
   }

   public String getSitRegBol() {
        return this.getVo().asString("SITREGBOL");
   }

   public void setSitRegBol(String sitRegBol) {
        markAsChanged("SITREGBOL", sitRegBol);
   }

   @Override
   public String getTableName() {
        return "TGFPJBH";
   }

   @Override
   public String getEntityName() {
        return "BoletoRapidoHist";
   }

   @Override
   public BoletoRapidoHist fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
