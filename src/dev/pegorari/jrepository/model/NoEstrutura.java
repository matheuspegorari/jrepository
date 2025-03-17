package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class NoEstrutura extends AbstractSankhyaEntity<NoEstrutura> {
   private BigDecimal chaveRegistro;
   private BigDecimal codEmp;
   private BigDecimal nivel;
   private BigDecimal nuEst;
   private BigDecimal nuInstancia;
   private BigDecimal nuNo;
   private BigDecimal nuNoPai;

   public BigDecimal getChaveRegistro() {
        return chaveRegistro;
   }

   public void setChaveRegistro(BigDecimal chaveRegistro) {
        this.chaveRegistro = chaveRegistro;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getNivel() {
        return nivel;
   }

   public void setNivel(BigDecimal nivel) {
        this.nivel = nivel;
   }

   public BigDecimal getNuEst() {
        return nuEst;
   }

   public void setNuEst(BigDecimal nuEst) {
        this.nuEst = nuEst;
   }

   public BigDecimal getNuInstancia() {
        return nuInstancia;
   }

   public void setNuInstancia(BigDecimal nuInstancia) {
        this.nuInstancia = nuInstancia;
   }

   public BigDecimal getNuNo() {
        return nuNo;
   }

   public void setNuNo(BigDecimal nuNo) {
        this.nuNo = nuNo;
   }

   public BigDecimal getNuNoPai() {
        return nuNoPai;
   }

   public void setNuNoPai(BigDecimal nuNoPai) {
        this.nuNoPai = nuNoPai;
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
        this.chaveRegistro = vo.asBigDecimal("CHAVEREGISTRO");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.nivel = vo.asBigDecimal("NIVEL");
        this.nuEst = vo.asBigDecimal("NUEST");
        this.nuInstancia = vo.asBigDecimal("NUINSTANCIA");
        this.nuNo = vo.asBigDecimal("NUNO");
        this.nuNoPai = vo.asBigDecimal("NUNOPAI");
        return this;
   }
}
