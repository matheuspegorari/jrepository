package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ContatoProspect extends AbstractSankhyaEntity<ContatoProspect> {
   private String apelido;
   private String cargo;
   private String celular;
   private BigDecimal codContato;
   private BigDecimal codPap;
   private String email;
   private String nomeContato;
   private String ramal;
   private String telefone;

   public String getApelido() {
        return apelido;
   }

   public void setApelido(String apelido) {
        markAsChanged("APELIDO", apelido);
        this.apelido = apelido;
   }

   public String getCargo() {
        return cargo;
   }

   public void setCargo(String cargo) {
        markAsChanged("CARGO", cargo);
        this.cargo = cargo;
   }

   public String getCelular() {
        return celular;
   }

   public void setCelular(String celular) {
        markAsChanged("CELULAR", celular);
        this.celular = celular;
   }

   public BigDecimal getCodContato() {
        return codContato;
   }

   public void setCodContato(BigDecimal codContato) {
        markAsChanged("CODCONTATO", codContato);
        this.codContato = codContato;
   }

   public BigDecimal getCodPap() {
        return codPap;
   }

   public void setCodPap(BigDecimal codPap) {
        markAsChanged("CODPAP", codPap);
        this.codPap = codPap;
   }

   public String getEmail() {
        return email;
   }

   public void setEmail(String email) {
        markAsChanged("EMAIL", email);
        this.email = email;
   }

   public String getNomeContato() {
        return nomeContato;
   }

   public void setNomeContato(String nomeContato) {
        markAsChanged("NOMECONTATO", nomeContato);
        this.nomeContato = nomeContato;
   }

   public String getRamal() {
        return ramal;
   }

   public void setRamal(String ramal) {
        markAsChanged("RAMAL", ramal);
        this.ramal = ramal;
   }

   public String getTelefone() {
        return telefone;
   }

   public void setTelefone(String telefone) {
        markAsChanged("TELEFONE", telefone);
        this.telefone = telefone;
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
        this.setOriginalVO(vo);
        this.apelido = vo.asString("APELIDO");
        this.cargo = vo.asString("CARGO");
        this.celular = vo.asString("CELULAR");
        this.codContato = vo.asBigDecimal("CODCONTATO");
        this.codPap = vo.asBigDecimal("CODPAP");
        this.email = vo.asString("EMAIL");
        this.nomeContato = vo.asString("NOMECONTATO");
        this.ramal = vo.asString("RAMAL");
        this.telefone = vo.asString("TELEFONE");
        return this;
   }
}
