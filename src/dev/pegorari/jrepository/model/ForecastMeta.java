package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ForecastMeta extends AbstractSankhyaEntity<ForecastMeta> {
   public String getControle() {
        return this.getVo().asString("CONTROLE");
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
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

   public String getNomeCenario() {
        return this.getVo().asString("NOMECENARIO");
   }

   public void setNomeCenario(String nomeCenario) {
        markAsChanged("NOMECENARIO", nomeCenario);
   }

   public String getObservacao() {
        return this.getVo().asString("OBSERVACAO");
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
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

   public String getCampoDetalhe() {
        return this.getVo().asString("CAMPODETALHE");
   }

   public void setCampoDetalhe(String campoDetalhe) {
        markAsChanged("CAMPODETALHE", campoDetalhe);
   }

   public BigDecimal getCodCenario() {
        return this.getVo().asBigDecimal("CODCENARIO");
   }

   public void setCodCenario(BigDecimal codCenario) {
        markAsChanged("CODCENARIO", codCenario);
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

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getCodVend() {
        return this.getVo().asBigDecimal("CODVEND");
   }

   public void setCodVend(BigDecimal codVend) {
        markAsChanged("CODVEND", codVend);
   }

   public BigDecimal getAno() {
        return this.getVo().asBigDecimal("ANO");
   }

   public void setAno(BigDecimal ano) {
        markAsChanged("ANO", ano);
   }

   public BigDecimal getMes() {
        return this.getVo().asBigDecimal("MES");
   }

   public void setMes(BigDecimal mes) {
        markAsChanged("MES", mes);
   }

   @Override
   public String getTableName() {
        return "TGMFCT";
   }

   @Override
   public String getEntityName() {
        return "ForecastMeta";
   }

   @Override
   public ForecastMeta fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
