package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class GrupoProduto extends AbstractSankhyaEntity<GrupoProduto> {
   private String agrupaLocValEst;
   private String analitico;
   private String aprProdVda;
   private BigDecimal areaOcupUnid;
   private String ativo;
   private BigDecimal codCenCus;
   private BigDecimal codGrupai;
   private BigDecimal codGrupoProd;
   private BigDecimal codNat;
   private BigDecimal codProj;
   private BigDecimal codRfa;
   private BigDecimal comCurvaA;
   private BigDecimal comCurvaB;
   private BigDecimal comCurvaC;
   private String descrGrupoProd;
   private BigDecimal grau;
   private BigDecimal grupoIcms;
   private byte[] imagem;
   private BigDecimal limCurvaB;
   private BigDecimal limCurvaC;
   private BigDecimal metaQtd;
   private BigDecimal particMeta;
   private String pedirLib;
   private BigDecimal percMeta;
   private BigDecimal percMetaContrib;
   private BigDecimal qtdExposicao;
   private String solCompra;
   private String tipoImposto;
   private String valEst;
   private BigDecimal percCmtImp;
   private BigDecimal percCmtNac;
   private String visivelAppos;
   private String consGruProdCat42;
   private BigDecimal percCmtEst;
   private BigDecimal percCmtFed;
   private BigDecimal percCmtMun;
   private BigDecimal codCtaCtbEfd;
   private String calRupturaEstoque;
   private BigDecimal codUsu;
   private Timestamp dhAlter;

   public String getAgrupaLocValEst() {
        return agrupaLocValEst;
   }

   public void setAgrupaLocValEst(String agrupaLocValEst) {
        this.agrupaLocValEst = agrupaLocValEst;
   }

   public String getAnalitico() {
        return analitico;
   }

   public void setAnalitico(String analitico) {
        this.analitico = analitico;
   }

   public String getAprProdVda() {
        return aprProdVda;
   }

   public void setAprProdVda(String aprProdVda) {
        this.aprProdVda = aprProdVda;
   }

   public BigDecimal getAreaOcupUnid() {
        return areaOcupUnid;
   }

   public void setAreaOcupUnid(BigDecimal areaOcupUnid) {
        this.areaOcupUnid = areaOcupUnid;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        this.ativo = ativo;
   }

   public BigDecimal getCodCenCus() {
        return codCenCus;
   }

   public void setCodCenCus(BigDecimal codCenCus) {
        this.codCenCus = codCenCus;
   }

   public BigDecimal getCodGrupai() {
        return codGrupai;
   }

   public void setCodGrupai(BigDecimal codGrupai) {
        this.codGrupai = codGrupai;
   }

   public BigDecimal getCodGrupoProd() {
        return codGrupoProd;
   }

   public void setCodGrupoProd(BigDecimal codGrupoProd) {
        this.codGrupoProd = codGrupoProd;
   }

   public BigDecimal getCodNat() {
        return codNat;
   }

   public void setCodNat(BigDecimal codNat) {
        this.codNat = codNat;
   }

   public BigDecimal getCodProj() {
        return codProj;
   }

   public void setCodProj(BigDecimal codProj) {
        this.codProj = codProj;
   }

   public BigDecimal getCodRfa() {
        return codRfa;
   }

   public void setCodRfa(BigDecimal codRfa) {
        this.codRfa = codRfa;
   }

   public BigDecimal getComCurvaA() {
        return comCurvaA;
   }

   public void setComCurvaA(BigDecimal comCurvaA) {
        this.comCurvaA = comCurvaA;
   }

   public BigDecimal getComCurvaB() {
        return comCurvaB;
   }

   public void setComCurvaB(BigDecimal comCurvaB) {
        this.comCurvaB = comCurvaB;
   }

   public BigDecimal getComCurvaC() {
        return comCurvaC;
   }

   public void setComCurvaC(BigDecimal comCurvaC) {
        this.comCurvaC = comCurvaC;
   }

   public String getDescrGrupoProd() {
        return descrGrupoProd;
   }

   public void setDescrGrupoProd(String descrGrupoProd) {
        this.descrGrupoProd = descrGrupoProd;
   }

   public BigDecimal getGrau() {
        return grau;
   }

   public void setGrau(BigDecimal grau) {
        this.grau = grau;
   }

   public BigDecimal getGrupoIcms() {
        return grupoIcms;
   }

   public void setGrupoIcms(BigDecimal grupoIcms) {
        this.grupoIcms = grupoIcms;
   }

   public byte[] getImagem() {
        return imagem;
   }

   public void setImagem(byte[] imagem) {
        this.imagem = imagem;
   }

   public BigDecimal getLimCurvaB() {
        return limCurvaB;
   }

   public void setLimCurvaB(BigDecimal limCurvaB) {
        this.limCurvaB = limCurvaB;
   }

   public BigDecimal getLimCurvaC() {
        return limCurvaC;
   }

   public void setLimCurvaC(BigDecimal limCurvaC) {
        this.limCurvaC = limCurvaC;
   }

   public BigDecimal getMetaQtd() {
        return metaQtd;
   }

   public void setMetaQtd(BigDecimal metaQtd) {
        this.metaQtd = metaQtd;
   }

   public BigDecimal getParticMeta() {
        return particMeta;
   }

   public void setParticMeta(BigDecimal particMeta) {
        this.particMeta = particMeta;
   }

   public String getPedirLib() {
        return pedirLib;
   }

   public void setPedirLib(String pedirLib) {
        this.pedirLib = pedirLib;
   }

   public BigDecimal getPercMeta() {
        return percMeta;
   }

   public void setPercMeta(BigDecimal percMeta) {
        this.percMeta = percMeta;
   }

   public BigDecimal getPercMetaContrib() {
        return percMetaContrib;
   }

   public void setPercMetaContrib(BigDecimal percMetaContrib) {
        this.percMetaContrib = percMetaContrib;
   }

   public BigDecimal getQtdExposicao() {
        return qtdExposicao;
   }

   public void setQtdExposicao(BigDecimal qtdExposicao) {
        this.qtdExposicao = qtdExposicao;
   }

   public String getSolCompra() {
        return solCompra;
   }

   public void setSolCompra(String solCompra) {
        this.solCompra = solCompra;
   }

   public String getTipoImposto() {
        return tipoImposto;
   }

   public void setTipoImposto(String tipoImposto) {
        this.tipoImposto = tipoImposto;
   }

   public String getValEst() {
        return valEst;
   }

   public void setValEst(String valEst) {
        this.valEst = valEst;
   }

   public BigDecimal getPercCmtImp() {
        return percCmtImp;
   }

   public void setPercCmtImp(BigDecimal percCmtImp) {
        this.percCmtImp = percCmtImp;
   }

   public BigDecimal getPercCmtNac() {
        return percCmtNac;
   }

   public void setPercCmtNac(BigDecimal percCmtNac) {
        this.percCmtNac = percCmtNac;
   }

   public String getVisivelAppos() {
        return visivelAppos;
   }

   public void setVisivelAppos(String visivelAppos) {
        this.visivelAppos = visivelAppos;
   }

   public String getConsGruProdCat42() {
        return consGruProdCat42;
   }

   public void setConsGruProdCat42(String consGruProdCat42) {
        this.consGruProdCat42 = consGruProdCat42;
   }

   public BigDecimal getPercCmtEst() {
        return percCmtEst;
   }

   public void setPercCmtEst(BigDecimal percCmtEst) {
        this.percCmtEst = percCmtEst;
   }

   public BigDecimal getPercCmtFed() {
        return percCmtFed;
   }

   public void setPercCmtFed(BigDecimal percCmtFed) {
        this.percCmtFed = percCmtFed;
   }

   public BigDecimal getPercCmtMun() {
        return percCmtMun;
   }

   public void setPercCmtMun(BigDecimal percCmtMun) {
        this.percCmtMun = percCmtMun;
   }

   public BigDecimal getCodCtaCtbEfd() {
        return codCtaCtbEfd;
   }

   public void setCodCtaCtbEfd(BigDecimal codCtaCtbEfd) {
        this.codCtaCtbEfd = codCtaCtbEfd;
   }

   public String getCalRupturaEstoque() {
        return calRupturaEstoque;
   }

   public void setCalRupturaEstoque(String calRupturaEstoque) {
        this.calRupturaEstoque = calRupturaEstoque;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        this.dhAlter = dhAlter;
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
        this.agrupaLocValEst = vo.asString("AGRUPALOCVALEST");
        this.analitico = vo.asString("ANALITICO");
        this.aprProdVda = vo.asString("APRPRODVDA");
        this.areaOcupUnid = vo.asBigDecimal("AREAOCUPUNID");
        this.ativo = vo.asString("ATIVO");
        this.codCenCus = vo.asBigDecimal("CODCENCUS");
        this.codGrupai = vo.asBigDecimal("CODGRUPAI");
        this.codGrupoProd = vo.asBigDecimal("CODGRUPOPROD");
        this.codNat = vo.asBigDecimal("CODNAT");
        this.codProj = vo.asBigDecimal("CODPROJ");
        this.codRfa = vo.asBigDecimal("CODRFA");
        this.comCurvaA = vo.asBigDecimal("COMCURVA_A");
        this.comCurvaB = vo.asBigDecimal("COMCURVA_B");
        this.comCurvaC = vo.asBigDecimal("COMCURVA_C");
        this.descrGrupoProd = vo.asString("DESCRGRUPOPROD");
        this.grau = vo.asBigDecimal("GRAU");
        this.grupoIcms = vo.asBigDecimal("GRUPOICMS");
        this.imagem = vo.asBlob("IMAGEM");
        this.limCurvaB = vo.asBigDecimal("LIMCURVA_B");
        this.limCurvaC = vo.asBigDecimal("LIMCURVA_C");
        this.metaQtd = vo.asBigDecimal("METAQTD");
        this.particMeta = vo.asBigDecimal("PARTICMETA");
        this.pedirLib = vo.asString("PEDIRLIB");
        this.percMeta = vo.asBigDecimal("PERCMETA");
        this.percMetaContrib = vo.asBigDecimal("PERCMETACONTRIB");
        this.qtdExposicao = vo.asBigDecimal("QTDEXPOSICAO");
        this.solCompra = vo.asString("SOLCOMPRA");
        this.tipoImposto = vo.asString("TIPOIMPOSTO");
        this.valEst = vo.asString("VALEST");
        this.percCmtImp = vo.asBigDecimal("PERCCMTIMP");
        this.percCmtNac = vo.asBigDecimal("PERCCMTNAC");
        this.visivelAppos = vo.asString("VISIVELAPPOS");
        this.consGruProdCat42 = vo.asString("CONSGRUPRODCAT42");
        this.percCmtEst = vo.asBigDecimal("PERCCMTEST");
        this.percCmtFed = vo.asBigDecimal("PERCCMTFED");
        this.percCmtMun = vo.asBigDecimal("PERCCMTMUN");
        this.codCtaCtbEfd = vo.asBigDecimal("CODCTACTBEFD");
        this.calRupturaEstoque = vo.asString("CALRUPTURAESTOQUE");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dhAlter = vo.asTimestamp("DHALTER");
        return this;
   }
}
