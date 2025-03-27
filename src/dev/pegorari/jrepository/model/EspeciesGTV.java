package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class EspeciesGTV extends AbstractSankhyaEntity<EspeciesGTV> {
   public String getIdInfGtv() {
        return this.getVo().asString("IDINFGTV");
   }

   public void setIdInfGtv(String idInfGtv) {
        markAsChanged("IDINFGTV", idInfGtv);
   }

   public String getNumInfGtv() {
        return this.getVo().asString("NUMINFGTV");
   }

   public void setNumInfGtv(String numInfGtv) {
        markAsChanged("NUMINFGTV", numInfGtv);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getTipoEspecie() {
        return this.getVo().asBigDecimal("TIPOESPECIE");
   }

   public void setTipoEspecie(BigDecimal tipoEspecie) {
        markAsChanged("TIPOESPECIE", tipoEspecie);
   }

   public BigDecimal getVlrEspecie() {
        return this.getVo().asBigDecimal("VLRESPECIE");
   }

   public void setVlrEspecie(BigDecimal vlrEspecie) {
        markAsChanged("VLRESPECIE", vlrEspecie);
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
        this.setVo(vo);
        return this;
   }
}
