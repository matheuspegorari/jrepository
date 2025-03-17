package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class LotacaoFuncionario implements SankhyaEntity<LotacaoFuncionario> {

   private BigDecimal codEmp;
   private BigDecimal codFunc;
   private BigDecimal codUsu;
   private Timestamp dhAlter;
   private Timestamp dtEntrada;
   private Timestamp dtSaida;
   private BigDecimal nuNo;

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodFunc() {
        return codFunc;
   }

   public void setCodFunc(BigDecimal codFunc) {
        this.codFunc = codFunc;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        this.dhAlter = dhAlter;
   }

   public Timestamp getDtEntrada() {
        return dtEntrada;
   }

   public void setDtEntrada(Timestamp dtEntrada) {
        this.dtEntrada = dtEntrada;
   }

   public Timestamp getDtSaida() {
        return dtSaida;
   }

   public void setDtSaida(Timestamp dtSaida) {
        this.dtSaida = dtSaida;
   }

   public BigDecimal getNuNo() {
        return nuNo;
   }

   public void setNuNo(BigDecimal nuNo) {
        this.nuNo = nuNo;
   }

   @Override
   public String getEntityName() {
        return "LotacaoFuncionario";
   }

   @Override
   public LotacaoFuncionario fromVO(DynamicVO vo) {
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codFunc = vo.asBigDecimal("CODFUNC");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.dtEntrada = vo.asTimestamp("DTENTRADA");
        this.dtSaida = vo.asTimestamp("DTSAIDA");
        this.nuNo = vo.asBigDecimal("NUNO");
        return this;
   }
}
