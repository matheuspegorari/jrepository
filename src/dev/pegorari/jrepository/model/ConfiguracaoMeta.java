package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ConfiguracaoMeta extends AbstractSankhyaEntity<ConfiguracaoMeta> {
   public String getInvestimento() {
        return this.getVo().asString("INVESTIMENTO");
   }

   public void setInvestimento(String investimento) {
        markAsChanged("INVESTIMENTO", investimento);
   }

   public BigDecimal getGrupoNat() {
        return this.getVo().asBigDecimal("GRUPONAT");
   }

   public void setGrupoNat(BigDecimal grupoNat) {
        markAsChanged("GRUPONAT", grupoNat);
   }

   public BigDecimal getLocal() {
        return this.getVo().asBigDecimal("LOCAL");
   }

   public void setLocal(BigDecimal local) {
        markAsChanged("LOCAL", local);
   }

   public BigDecimal getMarca() {
        return this.getVo().asBigDecimal("MARCA");
   }

   public void setMarca(BigDecimal marca) {
        markAsChanged("MARCA", marca);
   }

   public BigDecimal getNatureza() {
        return this.getVo().asBigDecimal("NATUREZA");
   }

   public void setNatureza(BigDecimal natureza) {
        markAsChanged("NATUREZA", natureza);
   }

   public BigDecimal getPais() {
        return this.getVo().asBigDecimal("PAIS");
   }

   public void setPais(BigDecimal pais) {
        markAsChanged("PAIS", pais);
   }

   public BigDecimal getPercAviso() {
        return this.getVo().asBigDecimal("PERCAVISO");
   }

   public void setPercAviso(BigDecimal percAviso) {
        markAsChanged("PERCAVISO", percAviso);
   }

   public BigDecimal getPerfil() {
        return this.getVo().asBigDecimal("PERFIL");
   }

   public void setPerfil(BigDecimal perfil) {
        markAsChanged("PERFIL", perfil);
   }

   public BigDecimal getPeriodo() {
        return this.getVo().asBigDecimal("PERIODO");
   }

   public void setPeriodo(BigDecimal periodo) {
        markAsChanged("PERIODO", periodo);
   }

   public BigDecimal getProduto() {
        return this.getVo().asBigDecimal("PRODUTO");
   }

   public void setProduto(BigDecimal produto) {
        markAsChanged("PRODUTO", produto);
   }

   public BigDecimal getProjeto() {
        return this.getVo().asBigDecimal("PROJETO");
   }

   public void setProjeto(BigDecimal projeto) {
        markAsChanged("PROJETO", projeto);
   }

   public BigDecimal getRegiao() {
        return this.getVo().asBigDecimal("REGIAO");
   }

   public void setRegiao(BigDecimal regiao) {
        markAsChanged("REGIAO", regiao);
   }

   public String getSimplificada() {
        return this.getVo().asString("SIMPLIFICADA");
   }

   public void setSimplificada(String simplificada) {
        markAsChanged("SIMPLIFICADA", simplificada);
   }

   public String getSomarImp() {
        return this.getVo().asString("SOMARIMP");
   }

   public void setSomarImp(String somarImp) {
        markAsChanged("SOMARIMP", somarImp);
   }

   public String getSomarInss() {
        return this.getVo().asString("SOMARINSS");
   }

   public void setSomarInss(String somarInss) {
        markAsChanged("SOMARINSS", somarInss);
   }

   public String getSomarIrrf() {
        return this.getVo().asString("SOMARIRRF");
   }

   public void setSomarIrrf(String somarIrrf) {
        markAsChanged("SOMARIRRF", somarIrrf);
   }

   public String getSomarIssRet() {
        return this.getVo().asString("SOMARISSRET");
   }

   public void setSomarIssRet(String somarIssRet) {
        markAsChanged("SOMARISSRET", somarIssRet);
   }

   public String getTipMeta() {
        return this.getVo().asString("TIPMETA");
   }

   public void setTipMeta(String tipMeta) {
        markAsChanged("TIPMETA", tipMeta);
   }

   public String getTipoData() {
        return this.getVo().asString("TIPODATA");
   }

   public void setTipoData(String tipoData) {
        markAsChanged("TIPODATA", tipoData);
   }

   public String getTipoMsg() {
        return this.getVo().asString("TIPOMSG");
   }

   public void setTipoMsg(String tipoMsg) {
        markAsChanged("TIPOMSG", tipoMsg);
   }

   public String getTipQtd() {
        return this.getVo().asString("TIPQTD");
   }

   public void setTipQtd(String tipQtd) {
        markAsChanged("TIPQTD", tipQtd);
   }

   public String getTipVlr() {
        return this.getVo().asString("TIPVLR");
   }

   public void setTipVlr(String tipVlr) {
        markAsChanged("TIPVLR", tipVlr);
   }

   public BigDecimal getUf() {
        return this.getVo().asBigDecimal("UF");
   }

   public void setUf(BigDecimal uf) {
        markAsChanged("UF", uf);
   }

   public String getValorBruto() {
        return this.getVo().asString("VALORBRUTO");
   }

   public void setValorBruto(String valorBruto) {
        markAsChanged("VALORBRUTO", valorBruto);
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

   public BigDecimal getVersao() {
        return this.getVo().asBigDecimal("VERSAO");
   }

   public void setVersao(BigDecimal versao) {
        markAsChanged("VERSAO", versao);
   }

   public String getIncComp() {
        return this.getVo().asString("INCCOMP");
   }

   public void setIncComp(String incComp) {
        markAsChanged("INCCOMP", incComp);
   }

   public String getArqImportPo() {
        return this.getVo().asString("ARQIMPORTPO");
   }

   public void setArqImportPo(String arqImportPo) {
        markAsChanged("ARQIMPORTPO", arqImportPo);
   }

   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public BigDecimal getCentroResultado() {
        return this.getVo().asBigDecimal("CENTRORESULTADO");
   }

   public void setCentroResultado(BigDecimal centroResultado) {
        markAsChanged("CENTRORESULTADO", centroResultado);
   }

   public BigDecimal getCidade() {
        return this.getVo().asBigDecimal("CIDADE");
   }

   public void setCidade(BigDecimal cidade) {
        markAsChanged("CIDADE", cidade);
   }

   public BigDecimal getCodGer() {
        return this.getVo().asBigDecimal("CODGER");
   }

   public void setCodGer(BigDecimal codGer) {
        markAsChanged("CODGER", codGer);
   }

   public BigDecimal getCodMeta() {
        return this.getVo().asBigDecimal("CODMETA");
   }

   public void setCodMeta(BigDecimal codMeta) {
        markAsChanged("CODMETA", codMeta);
   }

   public BigDecimal getCodMetaAnt() {
        return this.getVo().asBigDecimal("CODMETAANT");
   }

   public void setCodMetaAnt(BigDecimal codMetaAnt) {
        markAsChanged("CODMETAANT", codMetaAnt);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodUsuAprov() {
        return this.getVo().asBigDecimal("CODUSUAPROV");
   }

   public void setCodUsuAprov(BigDecimal codUsuAprov) {
        markAsChanged("CODUSUAPROV", codUsuAprov);
   }

   public BigDecimal getControle() {
        return this.getVo().asBigDecimal("CONTROLE");
   }

   public void setControle(BigDecimal controle) {
        markAsChanged("CONTROLE", controle);
   }

   public BigDecimal getData() {
        return this.getVo().asBigDecimal("DATA");
   }

   public void setData(BigDecimal data) {
        markAsChanged("DATA", data);
   }

   public String getDescricaoMeta() {
        return this.getVo().asString("DESCRMETA");
   }

   public void setDescricaoMeta(String descricaoMeta) {
        markAsChanged("DESCRMETA", descricaoMeta);
   }

   public Timestamp getDtAprov() {
        return this.getVo().asTimestamp("DTAPROV");
   }

   public void setDtAprov(Timestamp dtAprov) {
        markAsChanged("DTAPROV", dtAprov);
   }

   public BigDecimal getEmpresa() {
        return this.getVo().asBigDecimal("EMPRESA");
   }

   public void setEmpresa(BigDecimal empresa) {
        markAsChanged("EMPRESA", empresa);
   }

   public BigDecimal getExecutante() {
        return this.getVo().asBigDecimal("EXECUTANTE");
   }

   public void setExecutante(BigDecimal executante) {
        markAsChanged("EXECUTANTE", executante);
   }

   public BigDecimal getGrupo() {
        return this.getVo().asBigDecimal("GRUPO");
   }

   public void setGrupo(BigDecimal grupo) {
        markAsChanged("GRUPO", grupo);
   }

   public String getApresCod() {
        return this.getVo().asString("APRESCOD");
   }

   public void setApresCod(String apresCod) {
        markAsChanged("APRESCOD", apresCod);
   }

   public String getIgnorCnaoPrev() {
        return this.getVo().asString("IGNORCNAOPREV");
   }

   public void setIgnorCnaoPrev(String ignorCnaoPrev) {
        markAsChanged("IGNORCNAOPREV", ignorCnaoPrev);
   }

   public String getValorPrevigor() {
        return this.getVo().asString("VALPREVIGOR");
   }

   public void setValorPrevigor(String valorPrevigor) {
        markAsChanged("VALPREVIGOR", valorPrevigor);
   }

   public String getCampoSubstituto() {
        return this.getVo().asString("CAMPOSUBSTITUTO");
   }

   public void setCampoSubstituto(String campoSubstituto) {
        markAsChanged("CAMPOSUBSTITUTO", campoSubstituto);
   }

   public String getMetaPorQtd() {
        return this.getVo().asString("METAPORQTD");
   }

   public void setMetaPorQtd(String metaPorQtd) {
        markAsChanged("METAPORQTD", metaPorQtd);
   }

   public BigDecimal getDtIniCorc() {
        return this.getVo().asBigDecimal("DTINICORC");
   }

   public void setDtIniCorc(BigDecimal dtIniCorc) {
        markAsChanged("DTINICORC", dtIniCorc);
   }

   @Override
   public String getTableName() {
        return "TGMCFG";
   }

   @Override
   public String getEntityName() {
        return "ConfiguracaoMeta";
   }

   @Override
   public ConfiguracaoMeta fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
