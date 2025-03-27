package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PortariaCat42R0000 extends AbstractSankhyaEntity<PortariaCat42R0000> {
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

   public BigDecimal getCodFin() {
        return this.getVo().asBigDecimal("CODFIN");
   }

   public void setCodFin(BigDecimal codFin) {
        markAsChanged("CODFIN", codFin);
   }

   public BigDecimal getCodMun() {
        return this.getVo().asBigDecimal("CODMUN");
   }

   public void setCodMun(BigDecimal codMun) {
        markAsChanged("CODMUN", codMun);
   }

   public BigDecimal getCodVer() {
        return this.getVo().asBigDecimal("CODVER");
   }

   public void setCodVer(BigDecimal codVer) {
        markAsChanged("CODVER", codVer);
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

   public Timestamp getPeriodo() {
        return this.getVo().asTimestamp("PERIODO");
   }

   public void setPeriodo(Timestamp periodo) {
        markAsChanged("PERIODO", periodo);
   }

   public String getReg() {
        return this.getVo().asString("REG");
   }

   public void setReg(String reg) {
        markAsChanged("REG", reg);
   }

   @Override
   public String getTableName() {
        return "TGFCAT42R0000";
   }

   @Override
   public String getEntityName() {
        return "PortariaCat42R0000";
   }

   @Override
   public PortariaCat42R0000 fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
