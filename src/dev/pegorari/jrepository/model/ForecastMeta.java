package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ForecastMeta extends AbstractSankhyaEntity<ForecastMeta> {
   private String controle;
   private BigDecimal executante;
   private String marca;
   private String nomeCenario;
   private String observacao;
   private BigDecimal vendedor;
   private BigDecimal vendItem;
   private String campoDetalhe;
   private BigDecimal codCenario;
   private BigDecimal codCencus;
   private BigDecimal codCid;
   private BigDecimal codEmp;
   private BigDecimal codGer;
   private BigDecimal codGrupoNat;
   private BigDecimal codGrupoProd;
   private BigDecimal codLocal;
   private BigDecimal codMeta;
   private BigDecimal codNat;
   private BigDecimal codPais;
   private BigDecimal codParc;
   private BigDecimal codProd;
   private BigDecimal codProj;
   private BigDecimal codReg;
   private BigDecimal codTipParc;
   private BigDecimal codUf;
   private BigDecimal codUsu;
   private BigDecimal codVend;
   private BigDecimal ano;
   private BigDecimal mes;

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
        this.controle = controle;
   }

   public BigDecimal getExecutante() {
        return executante;
   }

   public void setExecutante(BigDecimal executante) {
        markAsChanged("EXECUTANTE", executante);
        this.executante = executante;
   }

   public String getMarca() {
        return marca;
   }

   public void setMarca(String marca) {
        markAsChanged("MARCA", marca);
        this.marca = marca;
   }

   public String getNomeCenario() {
        return nomeCenario;
   }

   public void setNomeCenario(String nomeCenario) {
        markAsChanged("NOMECENARIO", nomeCenario);
        this.nomeCenario = nomeCenario;
   }

   public String getObservacao() {
        return observacao;
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
        this.observacao = observacao;
   }

   public BigDecimal getVendedor() {
        return vendedor;
   }

   public void setVendedor(BigDecimal vendedor) {
        markAsChanged("VENDEDOR", vendedor);
        this.vendedor = vendedor;
   }

   public BigDecimal getVendItem() {
        return vendItem;
   }

   public void setVendItem(BigDecimal vendItem) {
        markAsChanged("VENDITEM", vendItem);
        this.vendItem = vendItem;
   }

   public String getCampoDetalhe() {
        return campoDetalhe;
   }

   public void setCampoDetalhe(String campoDetalhe) {
        markAsChanged("CAMPODETALHE", campoDetalhe);
        this.campoDetalhe = campoDetalhe;
   }

   public BigDecimal getCodCenario() {
        return codCenario;
   }

   public void setCodCenario(BigDecimal codCenario) {
        markAsChanged("CODCENARIO", codCenario);
        this.codCenario = codCenario;
   }

   public BigDecimal getCodCencus() {
        return codCencus;
   }

   public void setCodCencus(BigDecimal codCencus) {
        markAsChanged("CODCENCUS", codCencus);
        this.codCencus = codCencus;
   }

   public BigDecimal getCodCid() {
        return codCid;
   }

   public void setCodCid(BigDecimal codCid) {
        markAsChanged("CODCID", codCid);
        this.codCid = codCid;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodGer() {
        return codGer;
   }

   public void setCodGer(BigDecimal codGer) {
        markAsChanged("CODGER", codGer);
        this.codGer = codGer;
   }

   public BigDecimal getCodGrupoNat() {
        return codGrupoNat;
   }

   public void setCodGrupoNat(BigDecimal codGrupoNat) {
        markAsChanged("CODGRUPONAT", codGrupoNat);
        this.codGrupoNat = codGrupoNat;
   }

   public BigDecimal getCodGrupoProd() {
        return codGrupoProd;
   }

   public void setCodGrupoProd(BigDecimal codGrupoProd) {
        markAsChanged("CODGRUPOPROD", codGrupoProd);
        this.codGrupoProd = codGrupoProd;
   }

   public BigDecimal getCodLocal() {
        return codLocal;
   }

   public void setCodLocal(BigDecimal codLocal) {
        markAsChanged("CODLOCAL", codLocal);
        this.codLocal = codLocal;
   }

   public BigDecimal getCodMeta() {
        return codMeta;
   }

   public void setCodMeta(BigDecimal codMeta) {
        markAsChanged("CODMETA", codMeta);
        this.codMeta = codMeta;
   }

   public BigDecimal getCodNat() {
        return codNat;
   }

   public void setCodNat(BigDecimal codNat) {
        markAsChanged("CODNAT", codNat);
        this.codNat = codNat;
   }

   public BigDecimal getCodPais() {
        return codPais;
   }

   public void setCodPais(BigDecimal codPais) {
        markAsChanged("CODPAIS", codPais);
        this.codPais = codPais;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
        this.codParc = codParc;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   public BigDecimal getCodProj() {
        return codProj;
   }

   public void setCodProj(BigDecimal codProj) {
        markAsChanged("CODPROJ", codProj);
        this.codProj = codProj;
   }

   public BigDecimal getCodReg() {
        return codReg;
   }

   public void setCodReg(BigDecimal codReg) {
        markAsChanged("CODREG", codReg);
        this.codReg = codReg;
   }

   public BigDecimal getCodTipParc() {
        return codTipParc;
   }

   public void setCodTipParc(BigDecimal codTipParc) {
        markAsChanged("CODTIPPARC", codTipParc);
        this.codTipParc = codTipParc;
   }

   public BigDecimal getCodUf() {
        return codUf;
   }

   public void setCodUf(BigDecimal codUf) {
        markAsChanged("CODUF", codUf);
        this.codUf = codUf;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public BigDecimal getCodVend() {
        return codVend;
   }

   public void setCodVend(BigDecimal codVend) {
        markAsChanged("CODVEND", codVend);
        this.codVend = codVend;
   }

   public BigDecimal getAno() {
        return ano;
   }

   public void setAno(BigDecimal ano) {
        markAsChanged("ANO", ano);
        this.ano = ano;
   }

   public BigDecimal getMes() {
        return mes;
   }

   public void setMes(BigDecimal mes) {
        markAsChanged("MES", mes);
        this.mes = mes;
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
        this.controle = vo.asString("CONTROLE");
        this.executante = vo.asBigDecimal("EXECUTANTE");
        this.marca = vo.asString("MARCA");
        this.nomeCenario = vo.asString("NOMECENARIO");
        this.observacao = vo.asString("OBSERVACAO");
        this.vendedor = vo.asBigDecimal("VENDEDOR");
        this.vendItem = vo.asBigDecimal("VENDITEM");
        this.campoDetalhe = vo.asString("CAMPODETALHE");
        this.codCenario = vo.asBigDecimal("CODCENARIO");
        this.codCencus = vo.asBigDecimal("CODCENCUS");
        this.codCid = vo.asBigDecimal("CODCID");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codGer = vo.asBigDecimal("CODGER");
        this.codGrupoNat = vo.asBigDecimal("CODGRUPONAT");
        this.codGrupoProd = vo.asBigDecimal("CODGRUPOPROD");
        this.codLocal = vo.asBigDecimal("CODLOCAL");
        this.codMeta = vo.asBigDecimal("CODMETA");
        this.codNat = vo.asBigDecimal("CODNAT");
        this.codPais = vo.asBigDecimal("CODPAIS");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codProj = vo.asBigDecimal("CODPROJ");
        this.codReg = vo.asBigDecimal("CODREG");
        this.codTipParc = vo.asBigDecimal("CODTIPPARC");
        this.codUf = vo.asBigDecimal("CODUF");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.codVend = vo.asBigDecimal("CODVEND");
        this.ano = vo.asBigDecimal("ANO");
        this.mes = vo.asBigDecimal("MES");
        return this;
   }
}
