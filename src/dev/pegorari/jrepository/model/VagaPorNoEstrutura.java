package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class VagaPorNoEstrutura extends AbstractSankhyaEntity<VagaPorNoEstrutura> {
   private Timestamp dhAlter;
   private BigDecimal codEmp;
   private BigDecimal codUsu;
   private BigDecimal nuNo;
   private BigDecimal qtdVagas;

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public BigDecimal getNuNo() {
        return nuNo;
   }

   public void setNuNo(BigDecimal nuNo) {
        markAsChanged("NUNO", nuNo);
        this.nuNo = nuNo;
   }

   public BigDecimal getQtdVagas() {
        return qtdVagas;
   }

   public void setQtdVagas(BigDecimal qtdVagas) {
        markAsChanged("QTDVAGAS", qtdVagas);
        this.qtdVagas = qtdVagas;
   }

   @Override
   public String getTableName() {
        return "TRSVNE";
   }

   @Override
   public String getEntityName() {
        return "VagaPorNoEstrutura";
   }

   @Override
   public VagaPorNoEstrutura fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.nuNo = vo.asBigDecimal("NUNO");
        this.qtdVagas = vo.asBigDecimal("QTDVAGAS");
        return this;
   }
}
