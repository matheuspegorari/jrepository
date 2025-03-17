package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ConfiguracaoMeta implements SankhyaEntity<ConfiguracaoMeta> {

   private String investimento;
   private BigDecimal grupoNat;
   private BigDecimal local;
   private BigDecimal marca;
   private BigDecimal natureza;
   private BigDecimal pais;
   private BigDecimal percAviso;
   private BigDecimal perfil;
   private BigDecimal periodo;
   private BigDecimal produto;
   private BigDecimal projeto;
   private BigDecimal regiao;
   private String simplificada;
   private String somarImp;
   private String somarInss;
   private String somarIrrf;
   private String somarIssRet;
   private String tipMeta;
   private String tipoData;
   private String tipoMsg;
   private String tipQtd;
   private String tipVlr;
   private BigDecimal uf;
   private String valorBruto;
   private BigDecimal vendedor;
   private BigDecimal vendItem;
   private BigDecimal versao;
   private String incComp;
   private String arqImportPo;
   private String ativo;
   private BigDecimal centroResultado;
   private BigDecimal cidade;
   private BigDecimal codGer;
   private BigDecimal codMeta;
   private BigDecimal codMetaAnt;
   private BigDecimal codParc;
   private BigDecimal codUsuAprov;
   private BigDecimal controle;
   private BigDecimal data;
   private String descMeta;
   private Timestamp dtAprov;
   private BigDecimal empresa;
   private BigDecimal executante;
   private BigDecimal grupo;
   private String apresCod;
   private String ignorCnaoPrev;
   private String valPrevIgor;
   private String campoSubstituto;
   private String metaPorQtd;
   private BigDecimal dtIniCorc;

   public String getInvestimento() {
        return investimento;
   }

   public void setInvestimento(String investimento) {
        this.investimento = investimento;
   }

   public BigDecimal getGrupoNat() {
        return grupoNat;
   }

   public void setGrupoNat(BigDecimal grupoNat) {
        this.grupoNat = grupoNat;
   }

   public BigDecimal getLocal() {
        return local;
   }

   public void setLocal(BigDecimal local) {
        this.local = local;
   }

   public BigDecimal getMarca() {
        return marca;
   }

   public void setMarca(BigDecimal marca) {
        this.marca = marca;
   }

   public BigDecimal getNatureza() {
        return natureza;
   }

   public void setNatureza(BigDecimal natureza) {
        this.natureza = natureza;
   }

   public BigDecimal getPais() {
        return pais;
   }

   public void setPais(BigDecimal pais) {
        this.pais = pais;
   }

   public BigDecimal getPercAviso() {
        return percAviso;
   }

   public void setPercAviso(BigDecimal percAviso) {
        this.percAviso = percAviso;
   }

   public BigDecimal getPerfil() {
        return perfil;
   }

   public void setPerfil(BigDecimal perfil) {
        this.perfil = perfil;
   }

   public BigDecimal getPeriodo() {
        return periodo;
   }

   public void setPeriodo(BigDecimal periodo) {
        this.periodo = periodo;
   }

   public BigDecimal getProduto() {
        return produto;
   }

   public void setProduto(BigDecimal produto) {
        this.produto = produto;
   }

   public BigDecimal getProjeto() {
        return projeto;
   }

   public void setProjeto(BigDecimal projeto) {
        this.projeto = projeto;
   }

   public BigDecimal getRegiao() {
        return regiao;
   }

   public void setRegiao(BigDecimal regiao) {
        this.regiao = regiao;
   }

   public String getSimplificada() {
        return simplificada;
   }

   public void setSimplificada(String simplificada) {
        this.simplificada = simplificada;
   }

   public String getSomarImp() {
        return somarImp;
   }

   public void setSomarImp(String somarImp) {
        this.somarImp = somarImp;
   }

   public String getSomarInss() {
        return somarInss;
   }

   public void setSomarInss(String somarInss) {
        this.somarInss = somarInss;
   }

   public String getSomarIrrf() {
        return somarIrrf;
   }

   public void setSomarIrrf(String somarIrrf) {
        this.somarIrrf = somarIrrf;
   }

   public String getSomarIssRet() {
        return somarIssRet;
   }

   public void setSomarIssRet(String somarIssRet) {
        this.somarIssRet = somarIssRet;
   }

   public String getTipMeta() {
        return tipMeta;
   }

   public void setTipMeta(String tipMeta) {
        this.tipMeta = tipMeta;
   }

   public String getTipoData() {
        return tipoData;
   }

   public void setTipoData(String tipoData) {
        this.tipoData = tipoData;
   }

   public String getTipoMsg() {
        return tipoMsg;
   }

   public void setTipoMsg(String tipoMsg) {
        this.tipoMsg = tipoMsg;
   }

   public String getTipQtd() {
        return tipQtd;
   }

   public void setTipQtd(String tipQtd) {
        this.tipQtd = tipQtd;
   }

   public String getTipVlr() {
        return tipVlr;
   }

   public void setTipVlr(String tipVlr) {
        this.tipVlr = tipVlr;
   }

   public BigDecimal getUf() {
        return uf;
   }

   public void setUf(BigDecimal uf) {
        this.uf = uf;
   }

   public String getValorBruto() {
        return valorBruto;
   }

   public void setValorBruto(String valorBruto) {
        this.valorBruto = valorBruto;
   }

   public BigDecimal getVendedor() {
        return vendedor;
   }

   public void setVendedor(BigDecimal vendedor) {
        this.vendedor = vendedor;
   }

   public BigDecimal getVendItem() {
        return vendItem;
   }

   public void setVendItem(BigDecimal vendItem) {
        this.vendItem = vendItem;
   }

   public BigDecimal getVersao() {
        return versao;
   }

   public void setVersao(BigDecimal versao) {
        this.versao = versao;
   }

   public String getIncComp() {
        return incComp;
   }

   public void setIncComp(String incComp) {
        this.incComp = incComp;
   }

   public String getArqImportPo() {
        return arqImportPo;
   }

   public void setArqImportPo(String arqImportPo) {
        this.arqImportPo = arqImportPo;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        this.ativo = ativo;
   }

   public BigDecimal getCentroResultado() {
        return centroResultado;
   }

   public void setCentroResultado(BigDecimal centroResultado) {
        this.centroResultado = centroResultado;
   }

   public BigDecimal getCidade() {
        return cidade;
   }

   public void setCidade(BigDecimal cidade) {
        this.cidade = cidade;
   }

   public BigDecimal getCodGer() {
        return codGer;
   }

   public void setCodGer(BigDecimal codGer) {
        this.codGer = codGer;
   }

   public BigDecimal getCodMeta() {
        return codMeta;
   }

   public void setCodMeta(BigDecimal codMeta) {
        this.codMeta = codMeta;
   }

   public BigDecimal getCodMetaAnt() {
        return codMetaAnt;
   }

   public void setCodMetaAnt(BigDecimal codMetaAnt) {
        this.codMetaAnt = codMetaAnt;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
   }

   public BigDecimal getCodUsuAprov() {
        return codUsuAprov;
   }

   public void setCodUsuAprov(BigDecimal codUsuAprov) {
        this.codUsuAprov = codUsuAprov;
   }

   public BigDecimal getControle() {
        return controle;
   }

   public void setControle(BigDecimal controle) {
        this.controle = controle;
   }

   public BigDecimal getData() {
        return data;
   }

   public void setData(BigDecimal data) {
        this.data = data;
   }

   public String getDescMeta() {
        return descMeta;
   }

   public void setDescMeta(String descMeta) {
        this.descMeta = descMeta;
   }

   public Timestamp getDtAprov() {
        return dtAprov;
   }

   public void setDtAprov(Timestamp dtAprov) {
        this.dtAprov = dtAprov;
   }

   public BigDecimal getEmpresa() {
        return empresa;
   }

   public void setEmpresa(BigDecimal empresa) {
        this.empresa = empresa;
   }

   public BigDecimal getExecutante() {
        return executante;
   }

   public void setExecutante(BigDecimal executante) {
        this.executante = executante;
   }

   public BigDecimal getGrupo() {
        return grupo;
   }

   public void setGrupo(BigDecimal grupo) {
        this.grupo = grupo;
   }

   public String getApresCod() {
        return apresCod;
   }

   public void setApresCod(String apresCod) {
        this.apresCod = apresCod;
   }

   public String getIgnorCnaoPrev() {
        return ignorCnaoPrev;
   }

   public void setIgnorCnaoPrev(String ignorCnaoPrev) {
        this.ignorCnaoPrev = ignorCnaoPrev;
   }

   public String getValPrevIgor() {
        return valPrevIgor;
   }

   public void setValPrevIgor(String valPrevIgor) {
        this.valPrevIgor = valPrevIgor;
   }

   public String getCampoSubstituto() {
        return campoSubstituto;
   }

   public void setCampoSubstituto(String campoSubstituto) {
        this.campoSubstituto = campoSubstituto;
   }

   public String getMetaPorQtd() {
        return metaPorQtd;
   }

   public void setMetaPorQtd(String metaPorQtd) {
        this.metaPorQtd = metaPorQtd;
   }

   public BigDecimal getDtIniCorc() {
        return dtIniCorc;
   }

   public void setDtIniCorc(BigDecimal dtIniCorc) {
        this.dtIniCorc = dtIniCorc;
   }

   @Override
   public String getEntityName() {
        return "ConfiguracaoMeta";
   }

   @Override
   public ConfiguracaoMeta fromVO(DynamicVO vo) {
        this.investimento = vo.asString("INVESTIMENTO");
        this.grupoNat = vo.asBigDecimal("GRUPONAT");
        this.local = vo.asBigDecimal("LOCAL");
        this.marca = vo.asBigDecimal("MARCA");
        this.natureza = vo.asBigDecimal("NATUREZA");
        this.pais = vo.asBigDecimal("PAIS");
        this.percAviso = vo.asBigDecimal("PERCAVISO");
        this.perfil = vo.asBigDecimal("PERFIL");
        this.periodo = vo.asBigDecimal("PERIODO");
        this.produto = vo.asBigDecimal("PRODUTO");
        this.projeto = vo.asBigDecimal("PROJETO");
        this.regiao = vo.asBigDecimal("REGIAO");
        this.simplificada = vo.asString("SIMPLIFICADA");
        this.somarImp = vo.asString("SOMARIMP");
        this.somarInss = vo.asString("SOMARINSS");
        this.somarIrrf = vo.asString("SOMARIRRF");
        this.somarIssRet = vo.asString("SOMARISSRET");
        this.tipMeta = vo.asString("TIPMETA");
        this.tipoData = vo.asString("TIPODATA");
        this.tipoMsg = vo.asString("TIPOMSG");
        this.tipQtd = vo.asString("TIPQTD");
        this.tipVlr = vo.asString("TIPVLR");
        this.uf = vo.asBigDecimal("UF");
        this.valorBruto = vo.asString("VALORBRUTO");
        this.vendedor = vo.asBigDecimal("VENDEDOR");
        this.vendItem = vo.asBigDecimal("VENDITEM");
        this.versao = vo.asBigDecimal("VERSAO");
        this.incComp = vo.asString("INCCOMP");
        this.arqImportPo = vo.asString("ARQIMPORTPO");
        this.ativo = vo.asString("ATIVO");
        this.centroResultado = vo.asBigDecimal("CENTRORESULTADO");
        this.cidade = vo.asBigDecimal("CIDADE");
        this.codGer = vo.asBigDecimal("CODGER");
        this.codMeta = vo.asBigDecimal("CODMETA");
        this.codMetaAnt = vo.asBigDecimal("CODMETAANT");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codUsuAprov = vo.asBigDecimal("CODUSUAPROV");
        this.controle = vo.asBigDecimal("CONTROLE");
        this.data = vo.asBigDecimal("DATA");
        this.descMeta = vo.asString("DESCMETA");
        this.dtAprov = vo.asTimestamp("DTAPROV");
        this.empresa = vo.asBigDecimal("EMPRESA");
        this.executante = vo.asBigDecimal("EXECUTANTE");
        this.grupo = vo.asBigDecimal("GRUPO");
        this.apresCod = vo.asString("APRESCOD");
        this.ignorCnaoPrev = vo.asString("IGNORCNAOPREV");
        this.valPrevIgor = vo.asString("VALPREVIGOR");
        this.campoSubstituto = vo.asString("CAMPOSUBSTITUTO");
        this.metaPorQtd = vo.asString("METAPORQTD");
        this.dtIniCorc = vo.asBigDecimal("DTINICORC");
        return this;
   }
}
