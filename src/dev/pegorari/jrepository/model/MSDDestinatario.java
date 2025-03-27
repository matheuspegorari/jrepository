package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class MSDDestinatario extends AbstractSankhyaEntity<MSDDestinatario> {
   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public String getCelular() {
        return this.getVo().asString("CELULAR");
   }

   public void setCelular(String celular) {
        markAsChanged("CELULAR", celular);
   }

   public BigDecimal getCodCon() {
        return this.getVo().asBigDecimal("CODCON");
   }

   public void setCodCon(BigDecimal codCon) {
        markAsChanged("CODCON", codCon);
   }

   public BigDecimal getCodCont() {
        return this.getVo().asBigDecimal("CODCONT");
   }

   public void setCodCont(BigDecimal codCont) {
        markAsChanged("CODCONT", codCont);
   }

   public BigDecimal getCodFunc() {
        return this.getVo().asBigDecimal("CODFUNC");
   }

   public void setCodFunc(BigDecimal codFunc) {
        markAsChanged("CODFUNC", codFunc);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getEmail() {
        return this.getVo().asString("EMAIL");
   }

   public void setEmail(String email) {
        markAsChanged("EMAIL", email);
   }

   public String getNomeCon() {
        return this.getVo().asString("NOMECON");
   }

   public void setNomeCon(String nomeCon) {
        markAsChanged("NOMECON", nomeCon);
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
        this.setVo(vo);
        return this;
   }
}
