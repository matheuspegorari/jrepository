package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class VinculoContaExterna extends AbstractSankhyaEntity<VinculoContaExterna> {
   private Timestamp dtAlter;
   private BigDecimal codUsu;
   private String mascCtaExt;
   private String descrVinculo;
   private BigDecimal codEmp;
   private Timestamp dtMudaPlano;
   private String geraRi157Ecd;

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
        this.dtAlter = dtAlter;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public String getMascCtaExt() {
        return mascCtaExt;
   }

   public void setMascCtaExt(String mascCtaExt) {
        markAsChanged("MASCCTAEXT", mascCtaExt);
        this.mascCtaExt = mascCtaExt;
   }

   public String getDescrVinculo() {
        return descrVinculo;
   }

   public void setDescrVinculo(String descrVinculo) {
        markAsChanged("DESCRVINCULO", descrVinculo);
        this.descrVinculo = descrVinculo;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public Timestamp getDtMudaPlano() {
        return dtMudaPlano;
   }

   public void setDtMudaPlano(Timestamp dtMudaPlano) {
        markAsChanged("DTMUDAPLANO", dtMudaPlano);
        this.dtMudaPlano = dtMudaPlano;
   }

   public String getGeraRi157Ecd() {
        return geraRi157Ecd;
   }

   public void setGeraRi157Ecd(String geraRi157Ecd) {
        markAsChanged("GERARI157ECD", geraRi157Ecd);
        this.geraRi157Ecd = geraRi157Ecd;
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
        this.setOriginalVO(vo);
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.mascCtaExt = vo.asString("MASCCTAEXT");
        this.descrVinculo = vo.asString("DESCRVINCULO");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.dtMudaPlano = vo.asTimestamp("DTMUDAPLANO");
        this.geraRi157Ecd = vo.asString("GERARI157ECD");
        return this;
   }
}
