package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class CicloControleQualidade extends AbstractSankhyaEntity<CicloControleQualidade> {
   public String getAprovarComRessalvas() {
        return this.getVo().asString("APROVARCOMRESSALVAS");
   }

   public void setAprovarComRessalvas(String aprovarComRessalvas) {
        markAsChanged("APROVARCOMRESSALVAS", aprovarComRessalvas);
   }

   public String getDescrCiclo() {
        return this.getVo().asString("DESCRCICLO");
   }

   public void setDescrCiclo(String descrCiclo) {
        markAsChanged("DESCRCICLO", descrCiclo);
   }

   public BigDecimal getIdCcq() {
        return this.getVo().asBigDecimal("IDCCQ");
   }

   public void setIdCcq(BigDecimal idCcq) {
        markAsChanged("IDCCQ", idCcq);
   }

   public BigDecimal getIdProc() {
        return this.getVo().asBigDecimal("IDPROC");
   }

   public void setIdProc(BigDecimal idProc) {
        markAsChanged("IDPROC", idProc);
   }

   @Override
   public String getTableName() {
        return "TPRCCQ";
   }

   @Override
   public String getEntityName() {
        return "CicloControleQualidade";
   }

   @Override
   public CicloControleQualidade fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
