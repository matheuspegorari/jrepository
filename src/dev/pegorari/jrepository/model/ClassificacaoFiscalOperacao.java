package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ClassificacaoFiscalOperacao extends AbstractSankhyaEntity<ClassificacaoFiscalOperacao> {
   private String calcDifIcms;
   private BigDecimal codCfo;
   private BigDecimal codCtactb;
   private String convProduz;
   private String descCfo;
   private BigDecimal grupoCfo;
   private String tipIcms;
   private String tipo;
   private String tributadasCiap;
   private String tipoPerProdEpe;
   private String recBrutaEfdBlocOp;
   private String movimFisica;
   private String empCodSit08Efd;
   private String recBrutaCiap;
   private String desconsiderarCfoReg47;

   public String getCalcDifIcms() {
        return calcDifIcms;
   }

   public void setCalcDifIcms(String calcDifIcms) {
        markAsChanged("CALCDIFICMS", calcDifIcms);
        this.calcDifIcms = calcDifIcms;
   }

   public BigDecimal getCodCfo() {
        return codCfo;
   }

   public void setCodCfo(BigDecimal codCfo) {
        markAsChanged("CODCFO", codCfo);
        this.codCfo = codCfo;
   }

   public BigDecimal getCodCtactb() {
        return codCtactb;
   }

   public void setCodCtactb(BigDecimal codCtactb) {
        markAsChanged("CODCTACTB", codCtactb);
        this.codCtactb = codCtactb;
   }

   public String getConvProduz() {
        return convProduz;
   }

   public void setConvProduz(String convProduz) {
        markAsChanged("CONVPRODUZ", convProduz);
        this.convProduz = convProduz;
   }

   public String getDescCfo() {
        return descCfo;
   }

   public void setDescCfo(String descCfo) {
        markAsChanged("DESCRCFO", descCfo);
        this.descCfo = descCfo;
   }

   public BigDecimal getGrupoCfo() {
        return grupoCfo;
   }

   public void setGrupoCfo(BigDecimal grupoCfo) {
        markAsChanged("GRUPOCFO", grupoCfo);
        this.grupoCfo = grupoCfo;
   }

   public String getTipIcms() {
        return tipIcms;
   }

   public void setTipIcms(String tipIcms) {
        markAsChanged("TIPICMS", tipIcms);
        this.tipIcms = tipIcms;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
   }

   public String getTributadasCiap() {
        return tributadasCiap;
   }

   public void setTributadasCiap(String tributadasCiap) {
        markAsChanged("TRIBUTADASCIAP", tributadasCiap);
        this.tributadasCiap = tributadasCiap;
   }

   public String getTipoPerProdEpe() {
        return tipoPerProdEpe;
   }

   public void setTipoPerProdEpe(String tipoPerProdEpe) {
        markAsChanged("TIPOPERPRODEPE", tipoPerProdEpe);
        this.tipoPerProdEpe = tipoPerProdEpe;
   }

   public String getRecBrutaEfdBlocOp() {
        return recBrutaEfdBlocOp;
   }

   public void setRecBrutaEfdBlocOp(String recBrutaEfdBlocOp) {
        markAsChanged("RECBRUTAEFDBLOCOP", recBrutaEfdBlocOp);
        this.recBrutaEfdBlocOp = recBrutaEfdBlocOp;
   }

   public String getMovimFisica() {
        return movimFisica;
   }

   public void setMovimFisica(String movimFisica) {
        markAsChanged("MOVIMFISICA", movimFisica);
        this.movimFisica = movimFisica;
   }

   public String getEmpCodSit08Efd() {
        return empCodSit08Efd;
   }

   public void setEmpCodSit08Efd(String empCodSit08Efd) {
        markAsChanged("EMPCODSIT08EFD", empCodSit08Efd);
        this.empCodSit08Efd = empCodSit08Efd;
   }

   public String getRecBrutaCiap() {
        return recBrutaCiap;
   }

   public void setRecBrutaCiap(String recBrutaCiap) {
        markAsChanged("RECBRUTACIAP", recBrutaCiap);
        this.recBrutaCiap = recBrutaCiap;
   }

   public String getDesconsiderarCfoReg47() {
        return desconsiderarCfoReg47;
   }

   public void setDesconsiderarCfoReg47(String desconsiderarCfoReg47) {
        markAsChanged("DESCONSIDERARCFOREG47", desconsiderarCfoReg47);
        this.desconsiderarCfoReg47 = desconsiderarCfoReg47;
   }

   @Override
   public String getTableName() {
        return "TGFCFO";
   }

   @Override
   public String getEntityName() {
        return "ClassificacaoFiscalOperacao";
   }

   @Override
   public ClassificacaoFiscalOperacao fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.calcDifIcms = vo.asString("CALCDIFICMS");
        this.codCfo = vo.asBigDecimal("CODCFO");
        this.codCtactb = vo.asBigDecimal("CODCTACTB");
        this.convProduz = vo.asString("CONVPRODUZ");
        this.descCfo = vo.asString("DESCRCFO");
        this.grupoCfo = vo.asBigDecimal("GRUPOCFO");
        this.tipIcms = vo.asString("TIPICMS");
        this.tipo = vo.asString("TIPO");
        this.tributadasCiap = vo.asString("TRIBUTADASCIAP");
        this.tipoPerProdEpe = vo.asString("TIPOPERPRODEPE");
        this.recBrutaEfdBlocOp = vo.asString("RECBRUTAEFDBLOCOP");
        this.movimFisica = vo.asString("MOVIMFISICA");
        this.empCodSit08Efd = vo.asString("EMPCODSIT08EFD");
        this.recBrutaCiap = vo.asString("RECBRUTACIAP");
        this.desconsiderarCfoReg47 = vo.asString("DESCONSIDERARCFOREG47");
        return this;
   }
}
