package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class RegistroPalete extends AbstractSankhyaEntity<RegistroPalete> {
   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getCodVol() {
        return this.getVo().asString("CODVOL");
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
   }

   public String getControle() {
        return this.getVo().asString("CONTROLE");
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
   }

   public BigDecimal getIdPalete() {
        return this.getVo().asBigDecimal("IDPALETE");
   }

   public void setIdPalete(BigDecimal idPalete) {
        markAsChanged("IDPALETE", idPalete);
   }

   public String getImpresso() {
        return this.getVo().asString("IMPRESSO");
   }

   public void setImpresso(String impresso) {
        markAsChanged("IMPRESSO", impresso);
   }

   public BigDecimal getSeqPalete() {
        return this.getVo().asBigDecimal("SEQPALETE");
   }

   public void setSeqPalete(BigDecimal seqPalete) {
        markAsChanged("SEQPALETE", seqPalete);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   @Override
   public String getTableName() {
        return "TGWRPL";
   }

   @Override
   public String getEntityName() {
        return "RegistroPalete";
   }

   @Override
   public RegistroPalete fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
