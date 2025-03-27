package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class GrupoProduto extends AbstractSankhyaEntity<GrupoProduto> {
   public String getAgrupaLocValEst() {
        return this.getVo().asString("AGRUPALOCVALEST");
   }

   public void setAgrupaLocValEst(String agrupaLocValEst) {
        markAsChanged("AGRUPALOCVALEST", agrupaLocValEst);
   }

   public String getAnalitico() {
        return this.getVo().asString("ANALITICO");
   }

   public void setAnalitico(String analitico) {
        markAsChanged("ANALITICO", analitico);
   }

   public String getAprProdVda() {
        return this.getVo().asString("APRPRODVDA");
   }

   public void setAprProdVda(String aprProdVda) {
        markAsChanged("APRPRODVDA", aprProdVda);
   }

   public BigDecimal getAreaOcupUnid() {
        return this.getVo().asBigDecimal("AREAOCUPUNID");
   }

   public void setAreaOcupUnid(BigDecimal areaOcupUnid) {
        markAsChanged("AREAOCUPUNID", areaOcupUnid);
   }

   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public BigDecimal getCodCenCus() {
        return this.getVo().asBigDecimal("CODCENCUS");
   }

   public void setCodCenCus(BigDecimal codCenCus) {
        markAsChanged("CODCENCUS", codCenCus);
   }

   public BigDecimal getCodGrupai() {
        return this.getVo().asBigDecimal("CODGRUPAI");
   }

   public void setCodGrupai(BigDecimal codGrupai) {
        markAsChanged("CODGRUPAI", codGrupai);
   }

   public BigDecimal getCodGrupoProd() {
        return this.getVo().asBigDecimal("CODGRUPOPROD");
   }

   public void setCodGrupoProd(BigDecimal codGrupoProd) {
        markAsChanged("CODGRUPOPROD", codGrupoProd);
   }

   public BigDecimal getCodNat() {
        return this.getVo().asBigDecimal("CODNAT");
   }

   public void setCodNat(BigDecimal codNat) {
        markAsChanged("CODNAT", codNat);
   }

   public BigDecimal getCodProj() {
        return this.getVo().asBigDecimal("CODPROJ");
   }

   public void setCodProj(BigDecimal codProj) {
        markAsChanged("CODPROJ", codProj);
   }

   public BigDecimal getCodRfa() {
        return this.getVo().asBigDecimal("CODRFA");
   }

   public void setCodRfa(BigDecimal codRfa) {
        markAsChanged("CODRFA", codRfa);
   }

   public BigDecimal getComCurvaA() {
        return this.getVo().asBigDecimal("COMCURVA_A");
   }

   public void setComCurvaA(BigDecimal comCurvaA) {
        markAsChanged("COMCURVA_A", comCurvaA);
   }

   public BigDecimal getComCurvaB() {
        return this.getVo().asBigDecimal("COMCURVA_B");
   }

   public void setComCurvaB(BigDecimal comCurvaB) {
        markAsChanged("COMCURVA_B", comCurvaB);
   }

   public BigDecimal getComCurvaC() {
        return this.getVo().asBigDecimal("COMCURVA_C");
   }

   public void setComCurvaC(BigDecimal comCurvaC) {
        markAsChanged("COMCURVA_C", comCurvaC);
   }

   public String getDescrGrupoProd() {
        return this.getVo().asString("DESCRGRUPOPROD");
   }

   public void setDescrGrupoProd(String descrGrupoProd) {
        markAsChanged("DESCRGRUPOPROD", descrGrupoProd);
   }

   public BigDecimal getGrau() {
        return this.getVo().asBigDecimal("GRAU");
   }

   public void setGrau(BigDecimal grau) {
        markAsChanged("GRAU", grau);
   }

   public BigDecimal getGrupoIcms() {
        return this.getVo().asBigDecimal("GRUPOICMS");
   }

   public void setGrupoIcms(BigDecimal grupoIcms) {
        markAsChanged("GRUPOICMS", grupoIcms);
   }

   public byte[] getImagem() {
        return this.getVo().asBlob("IMAGEM");
   }

   public void setImagem(byte[] imagem) {
        markAsChanged("IMAGEM", imagem);
   }

   public BigDecimal getLimCurvaB() {
        return this.getVo().asBigDecimal("LIMCURVA_B");
   }

   public void setLimCurvaB(BigDecimal limCurvaB) {
        markAsChanged("LIMCURVA_B", limCurvaB);
   }

   public BigDecimal getLimCurvaC() {
        return this.getVo().asBigDecimal("LIMCURVA_C");
   }

   public void setLimCurvaC(BigDecimal limCurvaC) {
        markAsChanged("LIMCURVA_C", limCurvaC);
   }

   public BigDecimal getMetaQtd() {
        return this.getVo().asBigDecimal("METAQTD");
   }

   public void setMetaQtd(BigDecimal metaQtd) {
        markAsChanged("METAQTD", metaQtd);
   }

   public BigDecimal getParticMeta() {
        return this.getVo().asBigDecimal("PARTICMETA");
   }

   public void setParticMeta(BigDecimal particMeta) {
        markAsChanged("PARTICMETA", particMeta);
   }

   public String getPedirLib() {
        return this.getVo().asString("PEDIRLIB");
   }

   public void setPedirLib(String pedirLib) {
        markAsChanged("PEDIRLIB", pedirLib);
   }

   public BigDecimal getPercMeta() {
        return this.getVo().asBigDecimal("PERCMETA");
   }

   public void setPercMeta(BigDecimal percMeta) {
        markAsChanged("PERCMETA", percMeta);
   }

   public BigDecimal getPercMetaContrib() {
        return this.getVo().asBigDecimal("PERCMETACONTRIB");
   }

   public void setPercMetaContrib(BigDecimal percMetaContrib) {
        markAsChanged("PERCMETACONTRIB", percMetaContrib);
   }

   public BigDecimal getQtdExposicao() {
        return this.getVo().asBigDecimal("QTDEXPOSICAO");
   }

   public void setQtdExposicao(BigDecimal qtdExposicao) {
        markAsChanged("QTDEXPOSICAO", qtdExposicao);
   }

   public String getSolCompra() {
        return this.getVo().asString("SOLCOMPRA");
   }

   public void setSolCompra(String solCompra) {
        markAsChanged("SOLCOMPRA", solCompra);
   }

   public String getTipoImposto() {
        return this.getVo().asString("TIPOIMPOSTO");
   }

   public void setTipoImposto(String tipoImposto) {
        markAsChanged("TIPOIMPOSTO", tipoImposto);
   }

   public String getValEst() {
        return this.getVo().asString("VALEST");
   }

   public void setValEst(String valEst) {
        markAsChanged("VALEST", valEst);
   }

   public BigDecimal getPercCmtImp() {
        return this.getVo().asBigDecimal("PERCCMTIMP");
   }

   public void setPercCmtImp(BigDecimal percCmtImp) {
        markAsChanged("PERCCMTIMP", percCmtImp);
   }

   public BigDecimal getPercCmtNac() {
        return this.getVo().asBigDecimal("PERCCMTNAC");
   }

   public void setPercCmtNac(BigDecimal percCmtNac) {
        markAsChanged("PERCCMTNAC", percCmtNac);
   }

   public String getVisivelAppos() {
        return this.getVo().asString("VISIVELAPPOS");
   }

   public void setVisivelAppos(String visivelAppos) {
        markAsChanged("VISIVELAPPOS", visivelAppos);
   }

   public String getConsGruProdCat42() {
        return this.getVo().asString("CONSGRUPRODCAT42");
   }

   public void setConsGruProdCat42(String consGruProdCat42) {
        markAsChanged("CONSGRUPRODCAT42", consGruProdCat42);
   }

   public BigDecimal getPercCmtEst() {
        return this.getVo().asBigDecimal("PERCCMTEST");
   }

   public void setPercCmtEst(BigDecimal percCmtEst) {
        markAsChanged("PERCCMTEST", percCmtEst);
   }

   public BigDecimal getPercCmtFed() {
        return this.getVo().asBigDecimal("PERCCMTFED");
   }

   public void setPercCmtFed(BigDecimal percCmtFed) {
        markAsChanged("PERCCMTFED", percCmtFed);
   }

   public BigDecimal getPercCmtMun() {
        return this.getVo().asBigDecimal("PERCCMTMUN");
   }

   public void setPercCmtMun(BigDecimal percCmtMun) {
        markAsChanged("PERCCMTMUN", percCmtMun);
   }

   public BigDecimal getCodCtaCtbEfd() {
        return this.getVo().asBigDecimal("CODCTACTBEFD");
   }

   public void setCodCtaCtbEfd(BigDecimal codCtaCtbEfd) {
        markAsChanged("CODCTACTBEFD", codCtaCtbEfd);
   }

   public String getCalRupturaEstoque() {
        return this.getVo().asString("CALRUPTURAESTOQUE");
   }

   public void setCalRupturaEstoque(String calRupturaEstoque) {
        markAsChanged("CALRUPTURAESTOQUE", calRupturaEstoque);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   @Override
   public String getTableName() {
        return "TGFGRU";
   }

   @Override
   public String getEntityName() {
        return "GrupoProduto";
   }

   @Override
   public GrupoProduto fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
