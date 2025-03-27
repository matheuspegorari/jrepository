package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PortariaCat42R0150 extends AbstractSankhyaEntity<PortariaCat42R0150> {
   public String getCnpj() {
        return this.getVo().asString("CNPJ");
   }

   public void setCnpj(String cnpj) {
        markAsChanged("CNPJ", cnpj);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodMunFis() {
        return this.getVo().asBigDecimal("CODMUNFIS");
   }

   public void setCodMunFis(BigDecimal codMunFis) {
        markAsChanged("CODMUNFIS", codMunFis);
   }

   public BigDecimal getCodPaisFis() {
        return this.getVo().asBigDecimal("CODPAISFIS");
   }

   public void setCodPaisFis(BigDecimal codPaisFis) {
        markAsChanged("CODPAISFIS", codPaisFis);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public String getCpf() {
        return this.getVo().asString("CPF");
   }

   public void setCpf(String cpf) {
        markAsChanged("CPF", cpf);
   }

   public String getDigitado() {
        return this.getVo().asString("DIGITADO");
   }

   public void setDigitado(String digitado) {
        markAsChanged("DIGITADO", digitado);
   }

   public Timestamp getDtFinal() {
        return this.getVo().asTimestamp("DTFINAL");
   }

   public void setDtFinal(Timestamp dtFinal) {
        markAsChanged("DTFINAL", dtFinal);
   }

   public Timestamp getDtInicial() {
        return this.getVo().asTimestamp("DTINICIAL");
   }

   public void setDtInicial(Timestamp dtInicial) {
        markAsChanged("DTINICIAL", dtInicial);
   }

   public String getIe() {
        return this.getVo().asString("IE");
   }

   public void setIe(String ie) {
        markAsChanged("IE", ie);
   }

   public String getNome() {
        return this.getVo().asString("NOME");
   }

   public void setNome(String nome) {
        markAsChanged("NOME", nome);
   }

   public String getReg() {
        return this.getVo().asString("REG");
   }

   public void setReg(String reg) {
        markAsChanged("REG", reg);
   }

   @Override
   public String getTableName() {
        return "TGFCAT42R0150";
   }

   @Override
   public String getEntityName() {
        return "PortariaCat42R0150";
   }

   @Override
   public PortariaCat42R0150 fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
