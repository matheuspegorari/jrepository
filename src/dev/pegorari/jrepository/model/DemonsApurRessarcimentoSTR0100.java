package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class DemonsApurRessarcimentoSTR0100 extends AbstractSankhyaEntity<DemonsApurRessarcimentoSTR0100> {
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

   public String getEmail() {
        return this.getVo().asString("EMAIL");
   }

   public void setEmail(String email) {
        markAsChanged("EMAIL", email);
   }

   public String getEnder() {
        return this.getVo().asString("ENDER");
   }

   public void setEnder(String ender) {
        markAsChanged("ENDER", ender);
   }

   public String getFax() {
        return this.getVo().asString("FAX");
   }

   public void setFax(String fax) {
        markAsChanged("FAX", fax);
   }

   public String getFone() {
        return this.getVo().asString("FONE");
   }

   public void setFone(String fone) {
        markAsChanged("FONE", fone);
   }

   public String getNome() {
        return this.getVo().asString("NOME");
   }

   public void setNome(String nome) {
        markAsChanged("NOME", nome);
   }

   public String getNum() {
        return this.getVo().asString("NUM");
   }

   public void setNum(String num) {
        markAsChanged("NUM", num);
   }

   public String getReg() {
        return this.getVo().asString("REG");
   }

   public void setReg(String reg) {
        markAsChanged("REG", reg);
   }

   public String getBairro() {
        return this.getVo().asString("BAIRRO");
   }

   public void setBairro(String bairro) {
        markAsChanged("BAIRRO", bairro);
   }

   public String getCep() {
        return this.getVo().asString("CEP");
   }

   public void setCep(String cep) {
        markAsChanged("CEP", cep);
   }

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

   public BigDecimal getCodMun() {
        return this.getVo().asBigDecimal("CODMUN");
   }

   public void setCodMun(BigDecimal codMun) {
        markAsChanged("CODMUN", codMun);
   }

   public String getCompl() {
        return this.getVo().asString("COMPL");
   }

   public void setCompl(String compl) {
        markAsChanged("COMPL", compl);
   }

   public String getCpf() {
        return this.getVo().asString("CPF");
   }

   public void setCpf(String cpf) {
        markAsChanged("CPF", cpf);
   }

   public String getCrc() {
        return this.getVo().asString("CRC");
   }

   public void setCrc(String crc) {
        markAsChanged("CRC", crc);
   }

   @Override
   public String getTableName() {
        return "TGFDRCSTR0100";
   }

   @Override
   public String getEntityName() {
        return "DemonsApurRessarcimentoSTR0100";
   }

   @Override
   public DemonsApurRessarcimentoSTR0100 fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
