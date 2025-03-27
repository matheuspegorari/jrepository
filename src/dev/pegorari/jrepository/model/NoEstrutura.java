package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class NoEstrutura extends AbstractSankhyaEntity<NoEstrutura> {
   public BigDecimal getChaveRegistro() {
        return this.getVo().asBigDecimal("CHAVEREGISTRO");
   }

   public void setChaveRegistro(BigDecimal chaveRegistro) {
        markAsChanged("CHAVEREGISTRO", chaveRegistro);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getNivel() {
        return this.getVo().asBigDecimal("NIVEL");
   }

   public void setNivel(BigDecimal nivel) {
        markAsChanged("NIVEL", nivel);
   }

   public BigDecimal getNuEst() {
        return this.getVo().asBigDecimal("NUEST");
   }

   public void setNuEst(BigDecimal nuEst) {
        markAsChanged("NUEST", nuEst);
   }

   public BigDecimal getNuInstancia() {
        return this.getVo().asBigDecimal("NUINSTANCIA");
   }

   public void setNuInstancia(BigDecimal nuInstancia) {
        markAsChanged("NUINSTANCIA", nuInstancia);
   }

   public BigDecimal getNuNo() {
        return this.getVo().asBigDecimal("NUNO");
   }

   public void setNuNo(BigDecimal nuNo) {
        markAsChanged("NUNO", nuNo);
   }

   public BigDecimal getNuNoPai() {
        return this.getVo().asBigDecimal("NUNOPAI");
   }

   public void setNuNoPai(BigDecimal nuNoPai) {
        markAsChanged("NUNOPAI", nuNoPai);
   }

   @Override
   public String getTableName() {
        return "TGFNES";
   }

   @Override
   public String getEntityName() {
        return "NoEstrutura";
   }

   @Override
   public NoEstrutura fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
