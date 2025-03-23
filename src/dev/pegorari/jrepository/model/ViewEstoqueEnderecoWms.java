package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ViewEstoqueEnderecoWms extends AbstractSankhyaEntity<ViewEstoqueEnderecoWms> {
   private String exclConf;
   private String localizacao;
   private BigDecimal entradasPend;
   private BigDecimal estDispVolPad;
   private String bloqueado;
   private BigDecimal codAreaSep;
   private String nomeAreaSep;
   private BigDecimal estoqueVolPad;
   private BigDecimal saidasPend;
   private String descrLocal;
   private BigDecimal codProd;
   private String refForn;
   private String ativo;
   private BigDecimal pesoMax;
   private String descrGrupoProd;
   private String referencia;
   private String picking;
   private String multiProd;
   private String expedicao;
   private BigDecimal codGrupoProd;
   private BigDecimal m3Max;
   private String marca;
   private String ehDoca;
   private String complDesc;
   private BigDecimal codEmp;
   private String nomeFantasia;
   private String controle;
   private BigDecimal profundidade;
   private BigDecimal nivel;
   private BigDecimal largura;
   private BigDecimal altura;
   private BigDecimal estDisp;
   private String descrProd;
   private BigDecimal entrPendVolPad;
   private BigDecimal saidPendVolPad;
   private Timestamp dtVal;
   private String endMovVertical;
   private Timestamp dtRec;
   private BigDecimal idPalete;
   private BigDecimal codParc;
   private Timestamp dtValMinExp;
   private String observacao;
   private BigDecimal codEnd;
   private String descrEnd;
   private String endereco;
   private BigDecimal codEndPai;
   private BigDecimal codLocal;
   private String nomeParc;
   private BigDecimal estoque;
   private String codVol;
   private String codVolPad;

   public String getExclConf() {
        return exclConf;
   }

   public void setExclConf(String exclConf) {
        markAsChanged("EXCLCONF", exclConf);
        this.exclConf = exclConf;
   }

   public String getLocalizacao() {
        return localizacao;
   }

   public void setLocalizacao(String localizacao) {
        markAsChanged("LOCALIZACAO", localizacao);
        this.localizacao = localizacao;
   }

   public BigDecimal getEntradasPend() {
        return entradasPend;
   }

   public void setEntradasPend(BigDecimal entradasPend) {
        markAsChanged("ENTRADASPEND", entradasPend);
        this.entradasPend = entradasPend;
   }

   public BigDecimal getEstDispVolPad() {
        return estDispVolPad;
   }

   public void setEstDispVolPad(BigDecimal estDispVolPad) {
        markAsChanged("ESTDISPVOLPAD", estDispVolPad);
        this.estDispVolPad = estDispVolPad;
   }

   public String getBloqueado() {
        return bloqueado;
   }

   public void setBloqueado(String bloqueado) {
        markAsChanged("BLOQUEADO", bloqueado);
        this.bloqueado = bloqueado;
   }

   public BigDecimal getCodAreaSep() {
        return codAreaSep;
   }

   public void setCodAreaSep(BigDecimal codAreaSep) {
        markAsChanged("CODAREASEP", codAreaSep);
        this.codAreaSep = codAreaSep;
   }

   public String getNomeAreaSep() {
        return nomeAreaSep;
   }

   public void setNomeAreaSep(String nomeAreaSep) {
        markAsChanged("NOMEAREASEP", nomeAreaSep);
        this.nomeAreaSep = nomeAreaSep;
   }

   public BigDecimal getEstoqueVolPad() {
        return estoqueVolPad;
   }

   public void setEstoqueVolPad(BigDecimal estoqueVolPad) {
        markAsChanged("ESTOQUEVOLPAD", estoqueVolPad);
        this.estoqueVolPad = estoqueVolPad;
   }

   public BigDecimal getSaidasPend() {
        return saidasPend;
   }

   public void setSaidasPend(BigDecimal saidasPend) {
        markAsChanged("SAIDASPEND", saidasPend);
        this.saidasPend = saidasPend;
   }

   public String getDescrLocal() {
        return descrLocal;
   }

   public void setDescrLocal(String descrLocal) {
        markAsChanged("DESCRLOCAL", descrLocal);
        this.descrLocal = descrLocal;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   public String getRefForn() {
        return refForn;
   }

   public void setRefForn(String refForn) {
        markAsChanged("REFFORN", refForn);
        this.refForn = refForn;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public BigDecimal getPesoMax() {
        return pesoMax;
   }

   public void setPesoMax(BigDecimal pesoMax) {
        markAsChanged("PESOMAX", pesoMax);
        this.pesoMax = pesoMax;
   }

   public String getDescrGrupoProd() {
        return descrGrupoProd;
   }

   public void setDescrGrupoProd(String descrGrupoProd) {
        markAsChanged("DESCRGRUPOPROD", descrGrupoProd);
        this.descrGrupoProd = descrGrupoProd;
   }

   public String getReferencia() {
        return referencia;
   }

   public void setReferencia(String referencia) {
        markAsChanged("REFERENCIA", referencia);
        this.referencia = referencia;
   }

   public String getPicking() {
        return picking;
   }

   public void setPicking(String picking) {
        markAsChanged("PICKING", picking);
        this.picking = picking;
   }

   public String getMultiProd() {
        return multiProd;
   }

   public void setMultiProd(String multiProd) {
        markAsChanged("MULTIPROD", multiProd);
        this.multiProd = multiProd;
   }

   public String getExpedicao() {
        return expedicao;
   }

   public void setExpedicao(String expedicao) {
        markAsChanged("EXPEDICAO", expedicao);
        this.expedicao = expedicao;
   }

   public BigDecimal getCodGrupoProd() {
        return codGrupoProd;
   }

   public void setCodGrupoProd(BigDecimal codGrupoProd) {
        markAsChanged("CODGRUPOPROD", codGrupoProd);
        this.codGrupoProd = codGrupoProd;
   }

   public BigDecimal getM3Max() {
        return m3Max;
   }

   public void setM3Max(BigDecimal m3Max) {
        markAsChanged("M3MAX", m3Max);
        this.m3Max = m3Max;
   }

   public String getMarca() {
        return marca;
   }

   public void setMarca(String marca) {
        markAsChanged("MARCA", marca);
        this.marca = marca;
   }

   public String getEhDoca() {
        return ehDoca;
   }

   public void setEhDoca(String ehDoca) {
        markAsChanged("EHDOCA", ehDoca);
        this.ehDoca = ehDoca;
   }

   public String getComplDesc() {
        return complDesc;
   }

   public void setComplDesc(String complDesc) {
        markAsChanged("COMPLDESC", complDesc);
        this.complDesc = complDesc;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public String getNomeFantasia() {
        return nomeFantasia;
   }

   public void setNomeFantasia(String nomeFantasia) {
        markAsChanged("NOMEFANTASIA", nomeFantasia);
        this.nomeFantasia = nomeFantasia;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
        this.controle = controle;
   }

   public BigDecimal getProfundidade() {
        return profundidade;
   }

   public void setProfundidade(BigDecimal profundidade) {
        markAsChanged("PROFUNDIDADE", profundidade);
        this.profundidade = profundidade;
   }

   public BigDecimal getNivel() {
        return nivel;
   }

   public void setNivel(BigDecimal nivel) {
        markAsChanged("NIVEL", nivel);
        this.nivel = nivel;
   }

   public BigDecimal getLargura() {
        return largura;
   }

   public void setLargura(BigDecimal largura) {
        markAsChanged("LARGURA", largura);
        this.largura = largura;
   }

   public BigDecimal getAltura() {
        return altura;
   }

   public void setAltura(BigDecimal altura) {
        markAsChanged("ALTURA", altura);
        this.altura = altura;
   }

   public BigDecimal getEstDisp() {
        return estDisp;
   }

   public void setEstDisp(BigDecimal estDisp) {
        markAsChanged("ESTDISP", estDisp);
        this.estDisp = estDisp;
   }

   public String getDescrProd() {
        return descrProd;
   }

   public void setDescrProd(String descrProd) {
        markAsChanged("DESCRPROD", descrProd);
        this.descrProd = descrProd;
   }

   public BigDecimal getEntrPendVolPad() {
        return entrPendVolPad;
   }

   public void setEntrPendVolPad(BigDecimal entrPendVolPad) {
        markAsChanged("ENTRPENDVOLPAD", entrPendVolPad);
        this.entrPendVolPad = entrPendVolPad;
   }

   public BigDecimal getSaidPendVolPad() {
        return saidPendVolPad;
   }

   public void setSaidPendVolPad(BigDecimal saidPendVolPad) {
        markAsChanged("SAIDPENDVOLPAD", saidPendVolPad);
        this.saidPendVolPad = saidPendVolPad;
   }

   public Timestamp getDtVal() {
        return dtVal;
   }

   public void setDtVal(Timestamp dtVal) {
        markAsChanged("DTVAL", dtVal);
        this.dtVal = dtVal;
   }

   public String getEndMovVertical() {
        return endMovVertical;
   }

   public void setEndMovVertical(String endMovVertical) {
        markAsChanged("ENDMOVVERTICAL", endMovVertical);
        this.endMovVertical = endMovVertical;
   }

   public Timestamp getDtRec() {
        return dtRec;
   }

   public void setDtRec(Timestamp dtRec) {
        markAsChanged("DTREC", dtRec);
        this.dtRec = dtRec;
   }

   public BigDecimal getIdPalete() {
        return idPalete;
   }

   public void setIdPalete(BigDecimal idPalete) {
        markAsChanged("IDPALETE", idPalete);
        this.idPalete = idPalete;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
        this.codParc = codParc;
   }

   public Timestamp getDtValMinExp() {
        return dtValMinExp;
   }

   public void setDtValMinExp(Timestamp dtValMinExp) {
        markAsChanged("DTVALMINEXP", dtValMinExp);
        this.dtValMinExp = dtValMinExp;
   }

   public String getObservacao() {
        return observacao;
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
        this.observacao = observacao;
   }

   public BigDecimal getCodEnd() {
        return codEnd;
   }

   public void setCodEnd(BigDecimal codEnd) {
        markAsChanged("CODEND", codEnd);
        this.codEnd = codEnd;
   }

   public String getDescrEnd() {
        return descrEnd;
   }

   public void setDescrEnd(String descrEnd) {
        markAsChanged("DESCREND", descrEnd);
        this.descrEnd = descrEnd;
   }

   public String getEndereco() {
        return endereco;
   }

   public void setEndereco(String endereco) {
        markAsChanged("ENDERECO", endereco);
        this.endereco = endereco;
   }

   public BigDecimal getCodEndPai() {
        return codEndPai;
   }

   public void setCodEndPai(BigDecimal codEndPai) {
        markAsChanged("CODENDPAI", codEndPai);
        this.codEndPai = codEndPai;
   }

   public BigDecimal getCodLocal() {
        return codLocal;
   }

   public void setCodLocal(BigDecimal codLocal) {
        markAsChanged("CODLOCAL", codLocal);
        this.codLocal = codLocal;
   }

   public String getNomeParc() {
        return nomeParc;
   }

   public void setNomeParc(String nomeParc) {
        markAsChanged("NOMEPARC", nomeParc);
        this.nomeParc = nomeParc;
   }

   public BigDecimal getEstoque() {
        return estoque;
   }

   public void setEstoque(BigDecimal estoque) {
        markAsChanged("ESTOQUE", estoque);
        this.estoque = estoque;
   }

   public String getCodVol() {
        return codVol;
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
        this.codVol = codVol;
   }

   public String getCodVolPad() {
        return codVolPad;
   }

   public void setCodVolPad(String codVolPad) {
        markAsChanged("CODVOLPAD", codVolPad);
        this.codVolPad = codVolPad;
   }

   @Override
   public String getTableName() {
        return "VGWEST";
   }

   @Override
   public String getEntityName() {
        return "ViewEstoqueEnderecoWms";
   }

   @Override
   public ViewEstoqueEnderecoWms fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.exclConf = vo.asString("EXCLCONF");
        this.localizacao = vo.asString("LOCALIZACAO");
        this.entradasPend = vo.asBigDecimal("ENTRADASPEND");
        this.estDispVolPad = vo.asBigDecimal("ESTDISPVOLPAD");
        this.bloqueado = vo.asString("BLOQUEADO");
        this.codAreaSep = vo.asBigDecimal("CODAREASEP");
        this.nomeAreaSep = vo.asString("NOMEAREASEP");
        this.estoqueVolPad = vo.asBigDecimal("ESTOQUEVOLPAD");
        this.saidasPend = vo.asBigDecimal("SAIDASPEND");
        this.descrLocal = vo.asString("DESCRLOCAL");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.refForn = vo.asString("REFFORN");
        this.ativo = vo.asString("ATIVO");
        this.pesoMax = vo.asBigDecimal("PESOMAX");
        this.descrGrupoProd = vo.asString("DESCRGRUPOPROD");
        this.referencia = vo.asString("REFERENCIA");
        this.picking = vo.asString("PICKING");
        this.multiProd = vo.asString("MULTIPROD");
        this.expedicao = vo.asString("EXPEDICAO");
        this.codGrupoProd = vo.asBigDecimal("CODGRUPOPROD");
        this.m3Max = vo.asBigDecimal("M3MAX");
        this.marca = vo.asString("MARCA");
        this.ehDoca = vo.asString("EHDOCA");
        this.complDesc = vo.asString("COMPLDESC");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.nomeFantasia = vo.asString("NOMEFANTASIA");
        this.controle = vo.asString("CONTROLE");
        this.profundidade = vo.asBigDecimal("PROFUNDIDADE");
        this.nivel = vo.asBigDecimal("NIVEL");
        this.largura = vo.asBigDecimal("LARGURA");
        this.altura = vo.asBigDecimal("ALTURA");
        this.estDisp = vo.asBigDecimal("ESTDISP");
        this.descrProd = vo.asString("DESCRPROD");
        this.entrPendVolPad = vo.asBigDecimal("ENTRPENDVOLPAD");
        this.saidPendVolPad = vo.asBigDecimal("SAIDPENDVOLPAD");
        this.dtVal = vo.asTimestamp("DTVAL");
        this.endMovVertical = vo.asString("ENDMOVVERTICAL");
        this.dtRec = vo.asTimestamp("DTREC");
        this.idPalete = vo.asBigDecimal("IDPALETE");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.dtValMinExp = vo.asTimestamp("DTVALMINEXP");
        this.observacao = vo.asString("OBSERVACAO");
        this.codEnd = vo.asBigDecimal("CODEND");
        this.descrEnd = vo.asString("DESCREND");
        this.endereco = vo.asString("ENDERECO");
        this.codEndPai = vo.asBigDecimal("CODENDPAI");
        this.codLocal = vo.asBigDecimal("CODLOCAL");
        this.nomeParc = vo.asString("NOMEPARC");
        this.estoque = vo.asBigDecimal("ESTOQUE");
        this.codVol = vo.asString("CODVOL");
        this.codVolPad = vo.asString("CODVOLPAD");
        return this;
   }
}
