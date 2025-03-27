package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ContatoProspect extends AbstractSankhyaEntity<ContatoProspect> {
   public String getApelido() {
        return this.getVo().asString("APELIDO");
   }

   public void setApelido(String apelido) {
        markAsChanged("APELIDO", apelido);
   }

   public String getCargo() {
        return this.getVo().asString("CARGO");
   }

   public void setCargo(String cargo) {
        markAsChanged("CARGO", cargo);
   }

   public String getCelular() {
        return this.getVo().asString("CELULAR");
   }

   public void setCelular(String celular) {
        markAsChanged("CELULAR", celular);
   }

   public BigDecimal getCodContato() {
        return this.getVo().asBigDecimal("CODCONTATO");
   }

   public void setCodContato(BigDecimal codContato) {
        markAsChanged("CODCONTATO", codContato);
   }

   public BigDecimal getCodPap() {
        return this.getVo().asBigDecimal("CODPAP");
   }

   public void setCodPap(BigDecimal codPap) {
        markAsChanged("CODPAP", codPap);
   }

   public String getEmail() {
        return this.getVo().asString("EMAIL");
   }

   public void setEmail(String email) {
        markAsChanged("EMAIL", email);
   }

   public String getNomeContato() {
        return this.getVo().asString("NOMECONTATO");
   }

   public void setNomeContato(String nomeContato) {
        markAsChanged("NOMECONTATO", nomeContato);
   }

   public String getRamal() {
        return this.getVo().asString("RAMAL");
   }

   public void setRamal(String ramal) {
        markAsChanged("RAMAL", ramal);
   }

   public String getTelefone() {
        return this.getVo().asString("TELEFONE");
   }

   public void setTelefone(String telefone) {
        markAsChanged("TELEFONE", telefone);
   }

   @Override
   public String getTableName() {
        return "TCSCTT";
   }

   @Override
   public String getEntityName() {
        return "ContatoProspect";
   }

   @Override
   public ContatoProspect fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
