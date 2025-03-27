package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class VagaPorNoEstrutura extends AbstractSankhyaEntity<VagaPorNoEstrutura> {
   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getNuNo() {
        return this.getVo().asBigDecimal("NUNO");
   }

   public void setNuNo(BigDecimal nuNo) {
        markAsChanged("NUNO", nuNo);
   }

   public BigDecimal getQtdVagas() {
        return this.getVo().asBigDecimal("QTDVAGAS");
   }

   public void setQtdVagas(BigDecimal qtdVagas) {
        markAsChanged("QTDVAGAS", qtdVagas);
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
        this.setVo(vo);
        return this;
   }
}
