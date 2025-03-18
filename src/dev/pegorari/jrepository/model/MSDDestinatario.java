package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class MSDDestinatario extends AbstractSankhyaEntity<MSDDestinatario> {
   private String ativo;
   private String celular;
   private BigDecimal codCon;
   private BigDecimal codCont;
   private BigDecimal codFunc;
   private BigDecimal codParc;
   private BigDecimal codUsu;
   private String email;
   private String nomeCon;

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public String getCelular() {
        return celular;
   }

   public void setCelular(String celular) {
        markAsChanged("CELULAR", celular);
        this.celular = celular;
   }

   public BigDecimal getCodCon() {
        return codCon;
   }

   public void setCodCon(BigDecimal codCon) {
        markAsChanged("CODCON", codCon);
        this.codCon = codCon;
   }

   public BigDecimal getCodCont() {
        return codCont;
   }

   public void setCodCont(BigDecimal codCont) {
        markAsChanged("CODCONT", codCont);
        this.codCont = codCont;
   }

   public BigDecimal getCodFunc() {
        return codFunc;
   }

   public void setCodFunc(BigDecimal codFunc) {
        markAsChanged("CODFUNC", codFunc);
        this.codFunc = codFunc;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
        this.codParc = codParc;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public String getEmail() {
        return email;
   }

   public void setEmail(String email) {
        markAsChanged("EMAIL", email);
        this.email = email;
   }

   public String getNomeCon() {
        return nomeCon;
   }

   public void setNomeCon(String nomeCon) {
        markAsChanged("NOMECON", nomeCon);
        this.nomeCon = nomeCon;
   }

   @Override
   public String getTableName() {
        return "TMDCON";
   }

   @Override
   public String getEntityName() {
        return "MSDDestinatario";
   }

   @Override
   public MSDDestinatario fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.ativo = vo.asString("ATIVO");
        this.celular = vo.asString("CELULAR");
        this.codCon = vo.asBigDecimal("CODCON");
        this.codCont = vo.asBigDecimal("CODCONT");
        this.codFunc = vo.asBigDecimal("CODFUNC");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.email = vo.asString("EMAIL");
        this.nomeCon = vo.asString("NOMECON");
        return this;
   }
}
