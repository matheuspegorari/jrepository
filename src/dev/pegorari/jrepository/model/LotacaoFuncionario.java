package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class LotacaoFuncionario extends AbstractSankhyaEntity<LotacaoFuncionario> {
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
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodFunc() {
        return codFunc;
   }

   public void setCodFunc(BigDecimal codFunc) {
        markAsChanged("CODFUNC", codFunc);
        this.codFunc = codFunc;
   }

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

   public Timestamp getDtEntrada() {
        return dtEntrada;
   }

   public void setDtEntrada(Timestamp dtEntrada) {
        markAsChanged("DTENTRADA", dtEntrada);
        this.dtEntrada = dtEntrada;
   }

   public Timestamp getDtSaida() {
        return dtSaida;
   }

   public void setDtSaida(Timestamp dtSaida) {
        markAsChanged("DTSAIDA", dtSaida);
        this.dtSaida = dtSaida;
   }

   public BigDecimal getNuNo() {
        return nuNo;
   }

   public void setNuNo(BigDecimal nuNo) {
        markAsChanged("NUNO", nuNo);
        this.nuNo = nuNo;
   }

   @Override
   public String getTableName() {
        return "TFPLFU";
   }

   @Override
   public String getEntityName() {
        return "LotacaoFuncionario";
   }

   @Override
   public LotacaoFuncionario fromVO(DynamicVO vo) {
        this.setVo(vo);
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
