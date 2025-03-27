package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class FormatadorRemessa extends AbstractSankhyaEntity<FormatadorRemessa> {
   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public BigDecimal getCodigo() {
        return this.getVo().asBigDecimal("CODIGO");
   }

   public void setCodigo(BigDecimal codigo) {
        markAsChanged("CODIGO", codigo);
   }

   public BigDecimal getCodPai() {
        return this.getVo().asBigDecimal("CODPAI");
   }

   public void setCodPai(BigDecimal codPai) {
        markAsChanged("CODPAI", codPai);
   }

   public String getComGroupBy() {
        return this.getVo().asString("COMGROUPBY");
   }

   public void setComGroupBy(String comGroupBy) {
        markAsChanged("COMGROUPBY", comGroupBy);
   }

   public String getComHaving() {
        return this.getVo().asString("COMHAVING");
   }

   public void setComHaving(String comHaving) {
        markAsChanged("COMHAVING", comHaving);
   }

   public String getComOrderBy() {
        return this.getVo().asString("COMORDERBY");
   }

   public void setComOrderBy(String comOrderBy) {
        markAsChanged("COMORDERBY", comOrderBy);
   }

   public String getComSelect() {
        return this.getVo().asString("COMSELECT");
   }

   public void setComSelect(String comSelect) {
        markAsChanged("COMSELECT", comSelect);
   }

   public String getConf() {
        return this.getVo().asString("CONF");
   }

   public void setConf(String conf) {
        markAsChanged("CONF", conf);
   }

   public String getFicha() {
        return this.getVo().asString("FICHA");
   }

   public void setFicha(String ficha) {
        markAsChanged("FICHA", ficha);
   }

   public String getFiltro() {
        return this.getVo().asString("FILTRO");
   }

   public void setFiltro(String filtro) {
        markAsChanged("FILTRO", filtro);
   }

   public BigDecimal getGrau() {
        return this.getVo().asBigDecimal("GRAU");
   }

   public void setGrau(BigDecimal grau) {
        markAsChanged("GRAU", grau);
   }

   public String getIniCarqRem() {
        return this.getVo().asString("INICARQREM");
   }

   public void setIniCarqRem(String iniCarqRem) {
        markAsChanged("INICARQREM", iniCarqRem);
   }

   public String getModulo() {
        return this.getVo().asString("MODULO");
   }

   public void setModulo(String modulo) {
        markAsChanged("MODULO", modulo);
   }

   public String getNomeArq() {
        return this.getVo().asString("NOMEARQ");
   }

   public void setNomeArq(String nomeArq) {
        markAsChanged("NOMEARQ", nomeArq);
   }

   public String getOrdenar() {
        return this.getVo().asString("ORDENAR");
   }

   public void setOrdenar(String ordenar) {
        markAsChanged("ORDENAR", ordenar);
   }

   public BigDecimal getSeqInfo() {
        return this.getVo().asBigDecimal("SEQINFO");
   }

   public void setSeqInfo(BigDecimal seqInfo) {
        markAsChanged("SEQINFO", seqInfo);
   }

   public BigDecimal getTamRegistro() {
        return this.getVo().asBigDecimal("TAMREGISTRO");
   }

   public void setTamRegistro(BigDecimal tamRegistro) {
        markAsChanged("TAMREGISTRO", tamRegistro);
   }

   public String getTitulo() {
        return this.getVo().asString("TITULO");
   }

   public void setTitulo(String titulo) {
        markAsChanged("TITULO", titulo);
   }

   public String getUtilizaSeqAlt() {
        return this.getVo().asString("UTILIZASEQALT");
   }

   public void setUtilizaSeqAlt(String utilizaSeqAlt) {
        markAsChanged("UTILIZASEQALT", utilizaSeqAlt);
   }

   public String getUtilizaSeqInfo() {
        return this.getVo().asString("UTILIZASEQINFO");
   }

   public void setUtilizaSeqInfo(String utilizaSeqInfo) {
        markAsChanged("UTILIZASEQINFO", utilizaSeqInfo);
   }

   public String getAnalitico() {
        return this.getVo().asString("ANALITICO");
   }

   public void setAnalitico(String analitico) {
        markAsChanged("ANALITICO", analitico);
   }

   public String getArqPorLinha() {
        return this.getVo().asString("ARQPORLINHA");
   }

   public void setArqPorLinha(String arqPorLinha) {
        markAsChanged("ARQPORLINHA", arqPorLinha);
   }

   public String getConsultaSqlLote() {
        return this.getVo().asString("CONSULTASQLLOTE");
   }

   public void setConsultaSqlLote(String consultaSqlLote) {
        markAsChanged("CONSULTASQLLOTE", consultaSqlLote);
   }

   public String getArqPorLayoutDetalhe() {
        return this.getVo().asString("ARQPORLAYOUTDETALHE");
   }

   public void setArqPorLayoutDetalhe(String arqPorLayoutDetalhe) {
        markAsChanged("ARQPORLAYOUTDETALHE", arqPorLayoutDetalhe);
   }

   @Override
   public String getTableName() {
        return "TSIREM";
   }

   @Override
   public String getEntityName() {
        return "FormatadorRemessa";
   }

   @Override
   public FormatadorRemessa fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
