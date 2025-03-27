package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class VinculoContaExterna extends AbstractSankhyaEntity<VinculoContaExterna> {
   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getMascCtaExt() {
        return this.getVo().asString("MASCCTAEXT");
   }

   public void setMascCtaExt(String mascCtaExt) {
        markAsChanged("MASCCTAEXT", mascCtaExt);
   }

   public String getDescrVinculo() {
        return this.getVo().asString("DESCRVINCULO");
   }

   public void setDescrVinculo(String descrVinculo) {
        markAsChanged("DESCRVINCULO", descrVinculo);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public Timestamp getDtMudaPlano() {
        return this.getVo().asTimestamp("DTMUDAPLANO");
   }

   public void setDtMudaPlano(Timestamp dtMudaPlano) {
        markAsChanged("DTMUDAPLANO", dtMudaPlano);
   }

   public String getGeraRi157Ecd() {
        return this.getVo().asString("GERARI157ECD");
   }

   public void setGeraRi157Ecd(String geraRi157Ecd) {
        markAsChanged("GERARI157ECD", geraRi157Ecd);
   }

   @Override
   public String getTableName() {
        return "TCBVCE";
   }

   @Override
   public String getEntityName() {
        return "VinculoContaExterna";
   }

   @Override
   public VinculoContaExterna fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
