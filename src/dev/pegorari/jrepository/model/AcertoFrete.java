package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AcertoFrete extends AbstractSankhyaEntity<AcertoFrete> {
   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public BigDecimal getNuAcerto() {
        return this.getVo().asBigDecimal("NUACERTO");
   }

   public void setNuAcerto(BigDecimal nuAcerto) {
        markAsChanged("NUACERTO", nuAcerto);
   }

   public BigDecimal getNuFin() {
        return this.getVo().asBigDecimal("NUFIN");
   }

   public void setNuFin(BigDecimal nuFin) {
        markAsChanged("NUFIN", nuFin);
   }

   public BigDecimal getNuFinOrig() {
        return this.getVo().asBigDecimal("NUFINORIG");
   }

   public void setNuFinOrig(BigDecimal nuFinOrig) {
        markAsChanged("NUFINORIG", nuFinOrig);
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

   public String getTipAcerto() {
        return this.getVo().asString("TIPACERTO");
   }

   public void setTipAcerto(String tipAcerto) {
        markAsChanged("TIPACERTO", tipAcerto);
   }

   @Override
   public String getTableName() {
        return "TGFFRE";
   }

   @Override
   public String getEntityName() {
        return "AcertoFrete";
   }

   @Override
   public AcertoFrete fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
