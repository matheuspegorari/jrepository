package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class BoletoRapidoHist extends AbstractSankhyaEntity<BoletoRapidoHist> {
   private BigDecimal codUsu;
   private Timestamp dtAlt;
   private BigDecimal idUnico;
   private String motivo;
   private String sitRegBol;

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public Timestamp getDtAlt() {
        return dtAlt;
   }

   public void setDtAlt(Timestamp dtAlt) {
        this.dtAlt = dtAlt;
   }

   public BigDecimal getIdUnico() {
        return idUnico;
   }

   public void setIdUnico(BigDecimal idUnico) {
        this.idUnico = idUnico;
   }

   public String getMotivo() {
        return motivo;
   }

   public void setMotivo(String motivo) {
        this.motivo = motivo;
   }

   public String getSitRegBol() {
        return sitRegBol;
   }

   public void setSitRegBol(String sitRegBol) {
        this.sitRegBol = sitRegBol;
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
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dtAlt = vo.asTimestamp("DTALT");
        this.idUnico = vo.asBigDecimal("IDUNICO");
        this.motivo = vo.asString("MOTIVO");
        this.sitRegBol = vo.asString("SITREGBOL");
        return this;
   }
}
