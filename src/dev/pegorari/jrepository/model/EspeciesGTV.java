package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class EspeciesGTV extends AbstractSankhyaEntity<EspeciesGTV> {
   private String idInfGtv;
   private String numInfGtv;
   private BigDecimal nuNota;
   private BigDecimal tipoEspecie;
   private BigDecimal vlrEspecie;

   public String getIdInfGtv() {
        return idInfGtv;
   }

   public void setIdInfGtv(String idInfGtv) {
        markAsChanged("IDINFGTV", idInfGtv);
        this.idInfGtv = idInfGtv;
   }

   public String getNumInfGtv() {
        return numInfGtv;
   }

   public void setNumInfGtv(String numInfGtv) {
        markAsChanged("NUMINFGTV", numInfGtv);
        this.numInfGtv = numInfGtv;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public BigDecimal getTipoEspecie() {
        return tipoEspecie;
   }

   public void setTipoEspecie(BigDecimal tipoEspecie) {
        markAsChanged("TIPOESPECIE", tipoEspecie);
        this.tipoEspecie = tipoEspecie;
   }

   public BigDecimal getVlrEspecie() {
        return vlrEspecie;
   }

   public void setVlrEspecie(BigDecimal vlrEspecie) {
        markAsChanged("VLRESPECIE", vlrEspecie);
        this.vlrEspecie = vlrEspecie;
   }

   @Override
   public String getTableName() {
        return "TGFEGTV";
   }

   @Override
   public String getEntityName() {
        return "EspeciesGTV";
   }

   @Override
   public EspeciesGTV fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.idInfGtv = vo.asString("IDINFGTV");
        this.numInfGtv = vo.asString("NUMINFGTV");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.tipoEspecie = vo.asBigDecimal("TIPOESPECIE");
        this.vlrEspecie = vo.asBigDecimal("VLRESPECIE");
        return this;
   }
}
