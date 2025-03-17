package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class RegistroPalete extends AbstractSankhyaEntity<RegistroPalete> {
   private BigDecimal codUsu;
   private String codVol;
   private String controle;
   private BigDecimal idPalete;
   private String impresso;
   private BigDecimal seqPalete;
   private BigDecimal codEmp;
   private BigDecimal codProd;

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public String getCodVol() {
        return codVol;
   }

   public void setCodVol(String codVol) {
        this.codVol = codVol;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        this.controle = controle;
   }

   public BigDecimal getIdPalete() {
        return idPalete;
   }

   public void setIdPalete(BigDecimal idPalete) {
        this.idPalete = idPalete;
   }

   public String getImpresso() {
        return impresso;
   }

   public void setImpresso(String impresso) {
        this.impresso = impresso;
   }

   public BigDecimal getSeqPalete() {
        return seqPalete;
   }

   public void setSeqPalete(BigDecimal seqPalete) {
        this.seqPalete = seqPalete;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
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
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.codVol = vo.asString("CODVOL");
        this.controle = vo.asString("CONTROLE");
        this.idPalete = vo.asBigDecimal("IDPALETE");
        this.impresso = vo.asString("IMPRESSO");
        this.seqPalete = vo.asBigDecimal("SEQPALETE");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codProd = vo.asBigDecimal("CODPROD");
        return this;
   }
}
