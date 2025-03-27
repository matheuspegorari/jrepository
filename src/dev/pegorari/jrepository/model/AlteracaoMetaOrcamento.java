package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AlteracaoMetaOrcamento extends AbstractSankhyaEntity<AlteracaoMetaOrcamento> {
   public BigDecimal getPrevisto4() {
        return this.getVo().asBigDecimal("PREVISTO4");
   }

   public void setPrevisto4(BigDecimal previsto4) {
        markAsChanged("PREVISTO4", previsto4);
   }

   public BigDecimal getPrevisto5() {
        return this.getVo().asBigDecimal("PREVISTO5");
   }

   public void setPrevisto5(BigDecimal previsto5) {
        markAsChanged("PREVISTO5", previsto5);
   }

   public BigDecimal getPrevisto6() {
        return this.getVo().asBigDecimal("PREVISTO6");
   }

   public void setPrevisto6(BigDecimal previsto6) {
        markAsChanged("PREVISTO6", previsto6);
   }

   public BigDecimal getPrevisto7() {
        return this.getVo().asBigDecimal("PREVISTO7");
   }

   public void setPrevisto7(BigDecimal previsto7) {
        markAsChanged("PREVISTO7", previsto7);
   }

   public BigDecimal getPrevisto8() {
        return this.getVo().asBigDecimal("PREVISTO8");
   }

   public void setPrevisto8(BigDecimal previsto8) {
        markAsChanged("PREVISTO8", previsto8);
   }

   public BigDecimal getPrevisto9() {
        return this.getVo().asBigDecimal("PREVISTO9");
   }

   public void setPrevisto9(BigDecimal previsto9) {
        markAsChanged("PREVISTO9", previsto9);
   }

   public String getRecDesp() {
        return this.getVo().asString("RECDESP");
   }

   public void setRecDesp(String recDesp) {
        markAsChanged("RECDESP", recDesp);
   }

   public BigDecimal getVendedor() {
        return this.getVo().asBigDecimal("VENDEDOR");
   }

   public void setVendedor(BigDecimal vendedor) {
        markAsChanged("VENDEDOR", vendedor);
   }

   public BigDecimal getVendItem() {
        return this.getVo().asBigDecimal("VENDITEM");
   }

   public void setVendItem(BigDecimal vendItem) {
        markAsChanged("VENDITEM", vendItem);
   }

   public BigDecimal getAno() {
        return this.getVo().asBigDecimal("ANO");
   }

   public void setAno(BigDecimal ano) {
        markAsChanged("ANO", ano);
   }

   public BigDecimal getCodCencus() {
        return this.getVo().asBigDecimal("CODCENCUS");
   }

   public void setCodCencus(BigDecimal codCencus) {
        markAsChanged("CODCENCUS", codCencus);
   }

   public BigDecimal getCodCid() {
        return this.getVo().asBigDecimal("CODCID");
   }

   public void setCodCid(BigDecimal codCid) {
        markAsChanged("CODCID", codCid);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodGer() {
        return this.getVo().asBigDecimal("CODGER");
   }

   public void setCodGer(BigDecimal codGer) {
        markAsChanged("CODGER", codGer);
   }

   public BigDecimal getCodGrupoNat() {
        return this.getVo().asBigDecimal("CODGRUPONAT");
   }

   public void setCodGrupoNat(BigDecimal codGrupoNat) {
        markAsChanged("CODGRUPONAT", codGrupoNat);
   }

   public BigDecimal getCodGrupoProd() {
        return this.getVo().asBigDecimal("CODGRUPOPROD");
   }

   public void setCodGrupoProd(BigDecimal codGrupoProd) {
        markAsChanged("CODGRUPOPROD", codGrupoProd);
   }

   public BigDecimal getCodLocal() {
        return this.getVo().asBigDecimal("CODLOCAL");
   }

   public void setCodLocal(BigDecimal codLocal) {
        markAsChanged("CODLOCAL", codLocal);
   }

   public BigDecimal getCodMeta() {
        return this.getVo().asBigDecimal("CODMETA");
   }

   public void setCodMeta(BigDecimal codMeta) {
        markAsChanged("CODMETA", codMeta);
   }

   public BigDecimal getCodNat() {
        return this.getVo().asBigDecimal("CODNAT");
   }

   public void setCodNat(BigDecimal codNat) {
        markAsChanged("CODNAT", codNat);
   }

   public BigDecimal getCodPais() {
        return this.getVo().asBigDecimal("CODPAIS");
   }

   public void setCodPais(BigDecimal codPais) {
        markAsChanged("CODPAIS", codPais);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public BigDecimal getCodProj() {
        return this.getVo().asBigDecimal("CODPROJ");
   }

   public void setCodProj(BigDecimal codProj) {
        markAsChanged("CODPROJ", codProj);
   }

   public BigDecimal getCodReg() {
        return this.getVo().asBigDecimal("CODREG");
   }

   public void setCodReg(BigDecimal codReg) {
        markAsChanged("CODREG", codReg);
   }

   public BigDecimal getCodSolicitante() {
        return this.getVo().asBigDecimal("CODSOLICITANTE");
   }

   public void setCodSolicitante(BigDecimal codSolicitante) {
        markAsChanged("CODSOLICITANTE", codSolicitante);
   }

   public BigDecimal getCodTipParc() {
        return this.getVo().asBigDecimal("CODTIPPARC");
   }

   public void setCodTipParc(BigDecimal codTipParc) {
        markAsChanged("CODTIPPARC", codTipParc);
   }

   public BigDecimal getCodUf() {
        return this.getVo().asBigDecimal("CODUF");
   }

   public void setCodUf(BigDecimal codUf) {
        markAsChanged("CODUF", codUf);
   }

   public BigDecimal getCodVend() {
        return this.getVo().asBigDecimal("CODVEND");
   }

   public void setCodVend(BigDecimal codVend) {
        markAsChanged("CODVEND", codVend);
   }

   public String getControle() {
        return this.getVo().asString("CONTROLE");
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
   }

   public Timestamp getDhIntUnico() {
        return this.getVo().asTimestamp("DHINTUNICO");
   }

   public void setDhIntUnico(Timestamp dhIntUnico) {
        markAsChanged("DHINTUNICO", dhIntUnico);
   }

   public BigDecimal getExecutante() {
        return this.getVo().asBigDecimal("EXECUTANTE");
   }

   public void setExecutante(BigDecimal executante) {
        markAsChanged("EXECUTANTE", executante);
   }

   public String getMarca() {
        return this.getVo().asString("MARCA");
   }

   public void setMarca(String marca) {
        markAsChanged("MARCA", marca);
   }

   public BigDecimal getNuSolicitacao() {
        return this.getVo().asBigDecimal("NUSOLICITACAO");
   }

   public void setNuSolicitacao(BigDecimal nuSolicitacao) {
        markAsChanged("NUSOLICITACAO", nuSolicitacao);
   }

   public BigDecimal getPrevisto1() {
        return this.getVo().asBigDecimal("PREVISTO1");
   }

   public void setPrevisto1(BigDecimal previsto1) {
        markAsChanged("PREVISTO1", previsto1);
   }

   public BigDecimal getPrevisto10() {
        return this.getVo().asBigDecimal("PREVISTO10");
   }

   public void setPrevisto10(BigDecimal previsto10) {
        markAsChanged("PREVISTO10", previsto10);
   }

   public BigDecimal getPrevisto11() {
        return this.getVo().asBigDecimal("PREVISTO11");
   }

   public void setPrevisto11(BigDecimal previsto11) {
        markAsChanged("PREVISTO11", previsto11);
   }

   public BigDecimal getPrevisto12() {
        return this.getVo().asBigDecimal("PREVISTO12");
   }

   public void setPrevisto12(BigDecimal previsto12) {
        markAsChanged("PREVISTO12", previsto12);
   }

   public BigDecimal getPrevisto2() {
        return this.getVo().asBigDecimal("PREVISTO2");
   }

   public void setPrevisto2(BigDecimal previsto2) {
        markAsChanged("PREVISTO2", previsto2);
   }

   public BigDecimal getPrevisto3() {
        return this.getVo().asBigDecimal("PREVISTO3");
   }

   public void setPrevisto3(BigDecimal previsto3) {
        markAsChanged("PREVISTO3", previsto3);
   }

   @Override
   public String getTableName() {
        return "TGMAPO";
   }

   @Override
   public String getEntityName() {
        return "AlteracaoMetaOrcamento";
   }

   @Override
   public AlteracaoMetaOrcamento fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
