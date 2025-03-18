package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Relatorio extends AbstractSankhyaEntity<Relatorio> {
   private String idTela;
   private BigDecimal nuInstancia;
   private BigDecimal nuRfe;
   private BigDecimal nuRfeDependente;
   private String tipo;
   private BigDecimal codUsu;
   private char[] config;
   private String descricao;
   private Timestamp dhAlter;
   private String expFiltroInstancia;
   private String formato;
   private String categoria;
   private String dsName;
   private String prefixoAnexo;
   private String nomeImpressora;

   public String getIdTela() {
        return idTela;
   }

   public void setIdTela(String idTela) {
        markAsChanged("IDTELA", idTela);
        this.idTela = idTela;
   }

   public BigDecimal getNuInstancia() {
        return nuInstancia;
   }

   public void setNuInstancia(BigDecimal nuInstancia) {
        markAsChanged("NUINSTANCIA", nuInstancia);
        this.nuInstancia = nuInstancia;
   }

   public BigDecimal getNuRfe() {
        return nuRfe;
   }

   public void setNuRfe(BigDecimal nuRfe) {
        markAsChanged("NURFE", nuRfe);
        this.nuRfe = nuRfe;
   }

   public BigDecimal getNuRfeDependente() {
        return nuRfeDependente;
   }

   public void setNuRfeDependente(BigDecimal nuRfeDependente) {
        markAsChanged("NURFEDEPENDENTE", nuRfeDependente);
        this.nuRfeDependente = nuRfeDependente;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public char[] getConfig() {
        return config;
   }

   public void setConfig(char[] config) {
        markAsChanged("CONFIG", config);
        this.config = config;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
        this.descricao = descricao;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
   }

   public String getExpFiltroInstancia() {
        return expFiltroInstancia;
   }

   public void setExpFiltroInstancia(String expFiltroInstancia) {
        markAsChanged("EXPFILTROINSTANCIA", expFiltroInstancia);
        this.expFiltroInstancia = expFiltroInstancia;
   }

   public String getFormato() {
        return formato;
   }

   public void setFormato(String formato) {
        markAsChanged("FORMATO", formato);
        this.formato = formato;
   }

   public String getCategoria() {
        return categoria;
   }

   public void setCategoria(String categoria) {
        markAsChanged("CATEGORIA", categoria);
        this.categoria = categoria;
   }

   public String getDsName() {
        return dsName;
   }

   public void setDsName(String dsName) {
        markAsChanged("DSNAME", dsName);
        this.dsName = dsName;
   }

   public String getPrefixoAnexo() {
        return prefixoAnexo;
   }

   public void setPrefixoAnexo(String prefixoAnexo) {
        markAsChanged("PREFIXOANEXO", prefixoAnexo);
        this.prefixoAnexo = prefixoAnexo;
   }

   public String getNomeImpressora() {
        return nomeImpressora;
   }

   public void setNomeImpressora(String nomeImpressora) {
        markAsChanged("NOMEIMPRESSORA", nomeImpressora);
        this.nomeImpressora = nomeImpressora;
   }

   @Override
   public String getTableName() {
        return "TSIRFE";
   }

   @Override
   public String getEntityName() {
        return "Relatorio";
   }

   @Override
   public Relatorio fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.idTela = vo.asString("IDTELA");
        this.nuInstancia = vo.asBigDecimal("NUINSTANCIA");
        this.nuRfe = vo.asBigDecimal("NURFE");
        this.nuRfeDependente = vo.asBigDecimal("NURFEDEPENDENTE");
        this.tipo = vo.asString("TIPO");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.config = vo.asClob("CONFIG");
        this.descricao = vo.asString("DESCRICAO");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.expFiltroInstancia = vo.asString("EXPFILTROINSTANCIA");
        this.formato = vo.asString("FORMATO");
        this.categoria = vo.asString("CATEGORIA");
        this.dsName = vo.asString("DSNAME");
        this.prefixoAnexo = vo.asString("PREFIXOANEXO");
        this.nomeImpressora = vo.asString("NOMEIMPRESSORA");
        return this;
   }
}
