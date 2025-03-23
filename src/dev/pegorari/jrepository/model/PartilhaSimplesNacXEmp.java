package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PartilhaSimplesNacXEmp extends AbstractSankhyaEntity<PartilhaSimplesNacXEmp> {
   private BigDecimal codUsu;
   private Timestamp dhAlter;
   private Timestamp dtRef;
   private BigDecimal nuPartilha;
   private BigDecimal codEmp;
   private BigDecimal tipoSn;

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
   }

   public Timestamp getDtRef() {
        return dtRef;
   }

   public void setDtRef(Timestamp dtRef) {
        markAsChanged("DTREF", dtRef);
        this.dtRef = dtRef;
   }

   public BigDecimal getNuPartilha() {
        return nuPartilha;
   }

   public void setNuPartilha(BigDecimal nuPartilha) {
        markAsChanged("NUPARTILHA", nuPartilha);
        this.nuPartilha = nuPartilha;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getTipoSn() {
        return tipoSn;
   }

   public void setTipoSn(BigDecimal tipoSn) {
        markAsChanged("TIPOSN", tipoSn);
        this.tipoSn = tipoSn;
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
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.dtRef = vo.asTimestamp("DTREF");
        this.nuPartilha = vo.asBigDecimal("NUPARTILHA");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.tipoSn = vo.asBigDecimal("TIPOSN");
        return this;
   }
}
