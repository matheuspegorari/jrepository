package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class FormatadorRemessa extends AbstractSankhyaEntity<FormatadorRemessa> {
   private String ativo;
   private BigDecimal codigo;
   private BigDecimal codPai;
   private String comGroupBy;
   private String comHaving;
   private String comOrderBy;
   private String comSelect;
   private String conf;
   private String ficha;
   private String filtro;
   private BigDecimal grau;
   private String iniCarqRem;
   private String modulo;
   private String nomeArq;
   private String ordenar;
   private BigDecimal seqInfo;
   private BigDecimal tamRegistro;
   private String titulo;
   private String utilizaSeqAlt;
   private String utilizaSeqInfo;
   private String analitico;
   private String arqPorLinha;
   private String consultaSqlLote;
   private String arqPorLayoutDetalhe;

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public BigDecimal getCodigo() {
        return codigo;
   }

   public void setCodigo(BigDecimal codigo) {
        markAsChanged("CODIGO", codigo);
        this.codigo = codigo;
   }

   public BigDecimal getCodPai() {
        return codPai;
   }

   public void setCodPai(BigDecimal codPai) {
        markAsChanged("CODPAI", codPai);
        this.codPai = codPai;
   }

   public String getComGroupBy() {
        return comGroupBy;
   }

   public void setComGroupBy(String comGroupBy) {
        markAsChanged("COMGROUPBY", comGroupBy);
        this.comGroupBy = comGroupBy;
   }

   public String getComHaving() {
        return comHaving;
   }

   public void setComHaving(String comHaving) {
        markAsChanged("COMHAVING", comHaving);
        this.comHaving = comHaving;
   }

   public String getComOrderBy() {
        return comOrderBy;
   }

   public void setComOrderBy(String comOrderBy) {
        markAsChanged("COMORDERBY", comOrderBy);
        this.comOrderBy = comOrderBy;
   }

   public String getComSelect() {
        return comSelect;
   }

   public void setComSelect(String comSelect) {
        markAsChanged("COMSELECT", comSelect);
        this.comSelect = comSelect;
   }

   public String getConf() {
        return conf;
   }

   public void setConf(String conf) {
        markAsChanged("CONF", conf);
        this.conf = conf;
   }

   public String getFicha() {
        return ficha;
   }

   public void setFicha(String ficha) {
        markAsChanged("FICHA", ficha);
        this.ficha = ficha;
   }

   public String getFiltro() {
        return filtro;
   }

   public void setFiltro(String filtro) {
        markAsChanged("FILTRO", filtro);
        this.filtro = filtro;
   }

   public BigDecimal getGrau() {
        return grau;
   }

   public void setGrau(BigDecimal grau) {
        markAsChanged("GRAU", grau);
        this.grau = grau;
   }

   public String getIniCarqRem() {
        return iniCarqRem;
   }

   public void setIniCarqRem(String iniCarqRem) {
        markAsChanged("INICARQREM", iniCarqRem);
        this.iniCarqRem = iniCarqRem;
   }

   public String getModulo() {
        return modulo;
   }

   public void setModulo(String modulo) {
        markAsChanged("MODULO", modulo);
        this.modulo = modulo;
   }

   public String getNomeArq() {
        return nomeArq;
   }

   public void setNomeArq(String nomeArq) {
        markAsChanged("NOMEARQ", nomeArq);
        this.nomeArq = nomeArq;
   }

   public String getOrdenar() {
        return ordenar;
   }

   public void setOrdenar(String ordenar) {
        markAsChanged("ORDENAR", ordenar);
        this.ordenar = ordenar;
   }

   public BigDecimal getSeqInfo() {
        return seqInfo;
   }

   public void setSeqInfo(BigDecimal seqInfo) {
        markAsChanged("SEQINFO", seqInfo);
        this.seqInfo = seqInfo;
   }

   public BigDecimal getTamRegistro() {
        return tamRegistro;
   }

   public void setTamRegistro(BigDecimal tamRegistro) {
        markAsChanged("TAMREGISTRO", tamRegistro);
        this.tamRegistro = tamRegistro;
   }

   public String getTitulo() {
        return titulo;
   }

   public void setTitulo(String titulo) {
        markAsChanged("TITULO", titulo);
        this.titulo = titulo;
   }

   public String getUtilizaSeqAlt() {
        return utilizaSeqAlt;
   }

   public void setUtilizaSeqAlt(String utilizaSeqAlt) {
        markAsChanged("UTILIZASEQALT", utilizaSeqAlt);
        this.utilizaSeqAlt = utilizaSeqAlt;
   }

   public String getUtilizaSeqInfo() {
        return utilizaSeqInfo;
   }

   public void setUtilizaSeqInfo(String utilizaSeqInfo) {
        markAsChanged("UTILIZASEQINFO", utilizaSeqInfo);
        this.utilizaSeqInfo = utilizaSeqInfo;
   }

   public String getAnalitico() {
        return analitico;
   }

   public void setAnalitico(String analitico) {
        markAsChanged("ANALITICO", analitico);
        this.analitico = analitico;
   }

   public String getArqPorLinha() {
        return arqPorLinha;
   }

   public void setArqPorLinha(String arqPorLinha) {
        markAsChanged("ARQPORLINHA", arqPorLinha);
        this.arqPorLinha = arqPorLinha;
   }

   public String getConsultaSqlLote() {
        return consultaSqlLote;
   }

   public void setConsultaSqlLote(String consultaSqlLote) {
        markAsChanged("CONSULTASQLLOTE", consultaSqlLote);
        this.consultaSqlLote = consultaSqlLote;
   }

   public String getArqPorLayoutDetalhe() {
        return arqPorLayoutDetalhe;
   }

   public void setArqPorLayoutDetalhe(String arqPorLayoutDetalhe) {
        markAsChanged("ARQPORLAYOUTDETALHE", arqPorLayoutDetalhe);
        this.arqPorLayoutDetalhe = arqPorLayoutDetalhe;
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
        this.ativo = vo.asString("ATIVO");
        this.codigo = vo.asBigDecimal("CODIGO");
        this.codPai = vo.asBigDecimal("CODPAI");
        this.comGroupBy = vo.asString("COMGROUPBY");
        this.comHaving = vo.asString("COMHAVING");
        this.comOrderBy = vo.asString("COMORDERBY");
        this.comSelect = vo.asString("COMSELECT");
        this.conf = vo.asString("CONF");
        this.ficha = vo.asString("FICHA");
        this.filtro = vo.asString("FILTRO");
        this.grau = vo.asBigDecimal("GRAU");
        this.iniCarqRem = vo.asString("INICARQREM");
        this.modulo = vo.asString("MODULO");
        this.nomeArq = vo.asString("NOMEARQ");
        this.ordenar = vo.asString("ORDENAR");
        this.seqInfo = vo.asBigDecimal("SEQINFO");
        this.tamRegistro = vo.asBigDecimal("TAMREGISTRO");
        this.titulo = vo.asString("TITULO");
        this.utilizaSeqAlt = vo.asString("UTILIZASEQALT");
        this.utilizaSeqInfo = vo.asString("UTILIZASEQINFO");
        this.analitico = vo.asString("ANALITICO");
        this.arqPorLinha = vo.asString("ARQPORLINHA");
        this.consultaSqlLote = vo.asString("CONSULTASQLLOTE");
        this.arqPorLayoutDetalhe = vo.asString("ARQPORLAYOUTDETALHE");
        return this;
   }
}
