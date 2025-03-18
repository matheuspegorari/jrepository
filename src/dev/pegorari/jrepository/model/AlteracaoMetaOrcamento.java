package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AlteracaoMetaOrcamento extends AbstractSankhyaEntity<AlteracaoMetaOrcamento> {
   private BigDecimal previsto4;
   private BigDecimal previsto5;
   private BigDecimal previsto6;
   private BigDecimal previsto7;
   private BigDecimal previsto8;
   private BigDecimal previsto9;
   private String recDesp;
   private BigDecimal vendedor;
   private BigDecimal vendItem;
   private BigDecimal ano;
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
   private BigDecimal codSolicitante;
   private BigDecimal codTipParc;
   private BigDecimal codUf;
   private BigDecimal codVend;
   private String controle;
   private Timestamp dhIntUnico;
   private BigDecimal executante;
   private String marca;
   private BigDecimal nuSolicitacao;
   private BigDecimal previsto1;
   private BigDecimal previsto10;
   private BigDecimal previsto11;
   private BigDecimal previsto12;
   private BigDecimal previsto2;
   private BigDecimal previsto3;

   public BigDecimal getPrevisto4() {
        return previsto4;
   }

   public void setPrevisto4(BigDecimal previsto4) {
        markAsChanged("PREVISTO4", previsto4);
        this.previsto4 = previsto4;
   }

   public BigDecimal getPrevisto5() {
        return previsto5;
   }

   public void setPrevisto5(BigDecimal previsto5) {
        markAsChanged("PREVISTO5", previsto5);
        this.previsto5 = previsto5;
   }

   public BigDecimal getPrevisto6() {
        return previsto6;
   }

   public void setPrevisto6(BigDecimal previsto6) {
        markAsChanged("PREVISTO6", previsto6);
        this.previsto6 = previsto6;
   }

   public BigDecimal getPrevisto7() {
        return previsto7;
   }

   public void setPrevisto7(BigDecimal previsto7) {
        markAsChanged("PREVISTO7", previsto7);
        this.previsto7 = previsto7;
   }

   public BigDecimal getPrevisto8() {
        return previsto8;
   }

   public void setPrevisto8(BigDecimal previsto8) {
        markAsChanged("PREVISTO8", previsto8);
        this.previsto8 = previsto8;
   }

   public BigDecimal getPrevisto9() {
        return previsto9;
   }

   public void setPrevisto9(BigDecimal previsto9) {
        markAsChanged("PREVISTO9", previsto9);
        this.previsto9 = previsto9;
   }

   public String getRecDesp() {
        return recDesp;
   }

   public void setRecDesp(String recDesp) {
        markAsChanged("RECDESP", recDesp);
        this.recDesp = recDesp;
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

   public BigDecimal getAno() {
        return ano;
   }

   public void setAno(BigDecimal ano) {
        markAsChanged("ANO", ano);
        this.ano = ano;
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

   public BigDecimal getCodSolicitante() {
        return codSolicitante;
   }

   public void setCodSolicitante(BigDecimal codSolicitante) {
        markAsChanged("CODSOLICITANTE", codSolicitante);
        this.codSolicitante = codSolicitante;
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

   public BigDecimal getCodVend() {
        return codVend;
   }

   public void setCodVend(BigDecimal codVend) {
        markAsChanged("CODVEND", codVend);
        this.codVend = codVend;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
        this.controle = controle;
   }

   public Timestamp getDhIntUnico() {
        return dhIntUnico;
   }

   public void setDhIntUnico(Timestamp dhIntUnico) {
        markAsChanged("DHINTUNICO", dhIntUnico);
        this.dhIntUnico = dhIntUnico;
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

   public BigDecimal getNuSolicitacao() {
        return nuSolicitacao;
   }

   public void setNuSolicitacao(BigDecimal nuSolicitacao) {
        markAsChanged("NUSOLICITACAO", nuSolicitacao);
        this.nuSolicitacao = nuSolicitacao;
   }

   public BigDecimal getPrevisto1() {
        return previsto1;
   }

   public void setPrevisto1(BigDecimal previsto1) {
        markAsChanged("PREVISTO1", previsto1);
        this.previsto1 = previsto1;
   }

   public BigDecimal getPrevisto10() {
        return previsto10;
   }

   public void setPrevisto10(BigDecimal previsto10) {
        markAsChanged("PREVISTO10", previsto10);
        this.previsto10 = previsto10;
   }

   public BigDecimal getPrevisto11() {
        return previsto11;
   }

   public void setPrevisto11(BigDecimal previsto11) {
        markAsChanged("PREVISTO11", previsto11);
        this.previsto11 = previsto11;
   }

   public BigDecimal getPrevisto12() {
        return previsto12;
   }

   public void setPrevisto12(BigDecimal previsto12) {
        markAsChanged("PREVISTO12", previsto12);
        this.previsto12 = previsto12;
   }

   public BigDecimal getPrevisto2() {
        return previsto2;
   }

   public void setPrevisto2(BigDecimal previsto2) {
        markAsChanged("PREVISTO2", previsto2);
        this.previsto2 = previsto2;
   }

   public BigDecimal getPrevisto3() {
        return previsto3;
   }

   public void setPrevisto3(BigDecimal previsto3) {
        markAsChanged("PREVISTO3", previsto3);
        this.previsto3 = previsto3;
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
        this.setOriginalVO(vo);
        this.previsto4 = vo.asBigDecimal("PREVISTO4");
        this.previsto5 = vo.asBigDecimal("PREVISTO5");
        this.previsto6 = vo.asBigDecimal("PREVISTO6");
        this.previsto7 = vo.asBigDecimal("PREVISTO7");
        this.previsto8 = vo.asBigDecimal("PREVISTO8");
        this.previsto9 = vo.asBigDecimal("PREVISTO9");
        this.recDesp = vo.asString("RECDESP");
        this.vendedor = vo.asBigDecimal("VENDEDOR");
        this.vendItem = vo.asBigDecimal("VENDITEM");
        this.ano = vo.asBigDecimal("ANO");
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
        this.codSolicitante = vo.asBigDecimal("CODSOLICITANTE");
        this.codTipParc = vo.asBigDecimal("CODTIPPARC");
        this.codUf = vo.asBigDecimal("CODUF");
        this.codVend = vo.asBigDecimal("CODVEND");
        this.controle = vo.asString("CONTROLE");
        this.dhIntUnico = vo.asTimestamp("DHINTUNICO");
        this.executante = vo.asBigDecimal("EXECUTANTE");
        this.marca = vo.asString("MARCA");
        this.nuSolicitacao = vo.asBigDecimal("NUSOLICITACAO");
        this.previsto1 = vo.asBigDecimal("PREVISTO1");
        this.previsto10 = vo.asBigDecimal("PREVISTO10");
        this.previsto11 = vo.asBigDecimal("PREVISTO11");
        this.previsto12 = vo.asBigDecimal("PREVISTO12");
        this.previsto2 = vo.asBigDecimal("PREVISTO2");
        this.previsto3 = vo.asBigDecimal("PREVISTO3");
        return this;
   }
}
