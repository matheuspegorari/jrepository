package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class CicloControleQualidade implements SankhyaEntity<CicloControleQualidade> {

   private String aprovarComRessalvas;
   private String descrCiclo;
   private BigDecimal idCcq;
   private BigDecimal idProc;

   public String getAprovarComRessalvas() {
        return aprovarComRessalvas;
   }

   public void setAprovarComRessalvas(String aprovarComRessalvas) {
        this.aprovarComRessalvas = aprovarComRessalvas;
   }

   public String getDescrCiclo() {
        return descrCiclo;
   }

   public void setDescrCiclo(String descrCiclo) {
        this.descrCiclo = descrCiclo;
   }

   public BigDecimal getIdCcq() {
        return idCcq;
   }

   public void setIdCcq(BigDecimal idCcq) {
        this.idCcq = idCcq;
   }

   public BigDecimal getIdProc() {
        return idProc;
   }

   public void setIdProc(BigDecimal idProc) {
        this.idProc = idProc;
   }

   @Override
   public String getEntityName() {
        return "CicloControleQualidade";
   }

   @Override
   public CicloControleQualidade fromVO(DynamicVO vo) {
        this.aprovarComRessalvas = vo.asString("APROVARCOMRESSALVAS");
        this.descrCiclo = vo.asString("DESCRCICLO");
        this.idCcq = vo.asBigDecimal("IDCCQ");
        this.idProc = vo.asBigDecimal("IDPROC");
        return this;
   }
}
