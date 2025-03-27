package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class LotacaoFuncionario extends AbstractSankhyaEntity<LotacaoFuncionario> {
   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodFunc() {
        return this.getVo().asBigDecimal("CODFUNC");
   }

   public void setCodFunc(BigDecimal codFunc) {
        markAsChanged("CODFUNC", codFunc);
   }

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

   public Timestamp getDtEntrada() {
        return this.getVo().asTimestamp("DTENTRADA");
   }

   public void setDtEntrada(Timestamp dtEntrada) {
        markAsChanged("DTENTRADA", dtEntrada);
   }

   public Timestamp getDtSaida() {
        return this.getVo().asTimestamp("DTSAIDA");
   }

   public void setDtSaida(Timestamp dtSaida) {
        markAsChanged("DTSAIDA", dtSaida);
   }

   public BigDecimal getNuNo() {
        return this.getVo().asBigDecimal("NUNO");
   }

   public void setNuNo(BigDecimal nuNo) {
        markAsChanged("NUNO", nuNo);
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
        return this;
   }
}
