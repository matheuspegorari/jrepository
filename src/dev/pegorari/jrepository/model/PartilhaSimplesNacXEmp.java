package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PartilhaSimplesNacXEmp extends AbstractSankhyaEntity<PartilhaSimplesNacXEmp> {
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

   public Timestamp getDtRef() {
        return this.getVo().asTimestamp("DTREF");
   }

   public void setDtRef(Timestamp dtRef) {
        markAsChanged("DTREF", dtRef);
   }

   public BigDecimal getNuPartilha() {
        return this.getVo().asBigDecimal("NUPARTILHA");
   }

   public void setNuPartilha(BigDecimal nuPartilha) {
        markAsChanged("NUPARTILHA", nuPartilha);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getTipoSn() {
        return this.getVo().asBigDecimal("TIPOSN");
   }

   public void setTipoSn(BigDecimal tipoSn) {
        markAsChanged("TIPOSN", tipoSn);
   }

   @Override
   public String getTableName() {
        return "TGFEMPSN";
   }

   @Override
   public String getEntityName() {
        return "PartilhaSimplesNacXEmp";
   }

   @Override
   public PartilhaSimplesNacXEmp fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
