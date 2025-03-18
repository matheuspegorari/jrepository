package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ItemCotacao extends AbstractSankhyaEntity<ItemCotacao> {
   private BigDecimal aliqIcms;
   private BigDecimal aliqIpi;
   private String cabecalho;
   private BigDecimal codContato;
   private BigDecimal codLocal;
   private BigDecimal codMoeda;
   private BigDecimal codParc;
   private BigDecimal codProd;
   private BigDecimal codTipVenda;
   private String codVol;
   private BigDecimal confiabForn;
   private String controle;
   private BigDecimal cusGer;
   private BigDecimal cusMedIcm;
   private BigDecimal cusRep;
   private BigDecimal cusSemIcm;
   private BigDecimal cusVariavel;
   private BigDecimal difAliqIcms;
   private BigDecimal diferenciador;
   private Timestamp dtColetaPreco;
   private Timestamp dtMoeda;
   private BigDecimal fatMinimo;
   private BigDecimal frete;
   private BigDecimal garantia;
   private BigDecimal icms;
   private BigDecimal ipi;
   private String melhor;
   private BigDecimal numCotacao;
   private String obs;
   private BigDecimal outros;
   private BigDecimal percAcresc;
   private BigDecimal percDesc;
   private BigDecimal prazoEntrega;
   private BigDecimal prazoMedio;
   private BigDecimal prazoValProp;
   private BigDecimal preco;
   private BigDecimal precoCalc;
   private BigDecimal qtdCotada;
   private BigDecimal qualAtend;
   private BigDecimal qualProd;
   private BigDecimal resultCot;
   private String situacao;
   private BigDecimal taxaJuro;
   private BigDecimal vlrAcresc;
   private BigDecimal vlrDesc;
   private BigDecimal vlrMoeda;
   private BigDecimal vlrSubst;
   private Timestamp dhEntrega;
   private BigDecimal custoFinal;
   private String modFrete;
   private BigDecimal precoMoe;
   private BigDecimal valProposta;
   private BigDecimal vlrDescMoe;
   private BigDecimal empresa;
   private BigDecimal numeroOs;
   private BigDecimal codProdEsp;
   private BigDecimal fornecAprovado;
   private BigDecimal seqNotaCpa;
   private String statusPrecificacao;
   private BigDecimal codNat;
   private BigDecimal usuResp;
   private String statusEnvio;
   private Timestamp dhFinal;
   private BigDecimal prodAgrupMin;
   private BigDecimal prodDecQtd;
   private BigDecimal ultCusGer;
   private BigDecimal melhorPreco;
   private Timestamp dhInicial;
   private BigDecimal codProj;
   private String marca;
   private BigDecimal ultCusVar;
   private BigDecimal totalParceiros;
   private BigDecimal centResult;
   private BigDecimal ultCusRep;
   private BigDecimal prazoParc;
   private Timestamp dtLimPreco;
   private BigDecimal respMinCot;
   private Timestamp dtLimite;
   private Timestamp dtEnvioCot;
   private BigDecimal seqItemCot;
   private String statusProdCot;
   private BigDecimal usuSol;
   private BigDecimal melhorFornEc;
   private BigDecimal nuNotaCpa;
   private BigDecimal totalProduto;
   private BigDecimal qtdParcPagt;
   private String condPagt;
   private BigDecimal ultVlrUnitComp;
   private BigDecimal prodDecVlr;
   private String tipoColPreco;
   private BigDecimal codMotCan;
   private String complDesc;
   private String obsMotCanc;

   public BigDecimal getAliqIcms() {
        return aliqIcms;
   }

   public void setAliqIcms(BigDecimal aliqIcms) {
        markAsChanged("ALIQICMS", aliqIcms);
        this.aliqIcms = aliqIcms;
   }

   public BigDecimal getAliqIpi() {
        return aliqIpi;
   }

   public void setAliqIpi(BigDecimal aliqIpi) {
        markAsChanged("ALIQIPI", aliqIpi);
        this.aliqIpi = aliqIpi;
   }

   public String getCabecalho() {
        return cabecalho;
   }

   public void setCabecalho(String cabecalho) {
        markAsChanged("CABECALHO", cabecalho);
        this.cabecalho = cabecalho;
   }

   public BigDecimal getCodContato() {
        return codContato;
   }

   public void setCodContato(BigDecimal codContato) {
        markAsChanged("CODCONTATO", codContato);
        this.codContato = codContato;
   }

   public BigDecimal getCodLocal() {
        return codLocal;
   }

   public void setCodLocal(BigDecimal codLocal) {
        markAsChanged("CODLOCAL", codLocal);
        this.codLocal = codLocal;
   }

   public BigDecimal getCodMoeda() {
        return codMoeda;
   }

   public void setCodMoeda(BigDecimal codMoeda) {
        markAsChanged("CODMOEDA", codMoeda);
        this.codMoeda = codMoeda;
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

   public BigDecimal getCodTipVenda() {
        return codTipVenda;
   }

   public void setCodTipVenda(BigDecimal codTipVenda) {
        markAsChanged("CODTIPVENDA", codTipVenda);
        this.codTipVenda = codTipVenda;
   }

   public String getCodVol() {
        return codVol;
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
        this.codVol = codVol;
   }

   public BigDecimal getConfiabForn() {
        return confiabForn;
   }

   public void setConfiabForn(BigDecimal confiabForn) {
        markAsChanged("CONFIABFORN", confiabForn);
        this.confiabForn = confiabForn;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
        this.controle = controle;
   }

   public BigDecimal getCusGer() {
        return cusGer;
   }

   public void setCusGer(BigDecimal cusGer) {
        markAsChanged("CUSGER", cusGer);
        this.cusGer = cusGer;
   }

   public BigDecimal getCusMedIcm() {
        return cusMedIcm;
   }

   public void setCusMedIcm(BigDecimal cusMedIcm) {
        markAsChanged("CUSMEDICM", cusMedIcm);
        this.cusMedIcm = cusMedIcm;
   }

   public BigDecimal getCusRep() {
        return cusRep;
   }

   public void setCusRep(BigDecimal cusRep) {
        markAsChanged("CUSREP", cusRep);
        this.cusRep = cusRep;
   }

   public BigDecimal getCusSemIcm() {
        return cusSemIcm;
   }

   public void setCusSemIcm(BigDecimal cusSemIcm) {
        markAsChanged("CUSSEMICM", cusSemIcm);
        this.cusSemIcm = cusSemIcm;
   }

   public BigDecimal getCusVariavel() {
        return cusVariavel;
   }

   public void setCusVariavel(BigDecimal cusVariavel) {
        markAsChanged("CUSVARIAVEL", cusVariavel);
        this.cusVariavel = cusVariavel;
   }

   public BigDecimal getDifAliqIcms() {
        return difAliqIcms;
   }

   public void setDifAliqIcms(BigDecimal difAliqIcms) {
        markAsChanged("DIFALIQICMS", difAliqIcms);
        this.difAliqIcms = difAliqIcms;
   }

   public BigDecimal getDiferenciador() {
        return diferenciador;
   }

   public void setDiferenciador(BigDecimal diferenciador) {
        markAsChanged("DIFERENCIADOR", diferenciador);
        this.diferenciador = diferenciador;
   }

   public Timestamp getDtColetaPreco() {
        return dtColetaPreco;
   }

   public void setDtColetaPreco(Timestamp dtColetaPreco) {
        markAsChanged("DTCOLETAPRECO", dtColetaPreco);
        this.dtColetaPreco = dtColetaPreco;
   }

   public Timestamp getDtMoeda() {
        return dtMoeda;
   }

   public void setDtMoeda(Timestamp dtMoeda) {
        markAsChanged("DTMOEDA", dtMoeda);
        this.dtMoeda = dtMoeda;
   }

   public BigDecimal getFatMinimo() {
        return fatMinimo;
   }

   public void setFatMinimo(BigDecimal fatMinimo) {
        markAsChanged("FATMINIMO", fatMinimo);
        this.fatMinimo = fatMinimo;
   }

   public BigDecimal getFrete() {
        return frete;
   }

   public void setFrete(BigDecimal frete) {
        markAsChanged("FRETE", frete);
        this.frete = frete;
   }

   public BigDecimal getGarantia() {
        return garantia;
   }

   public void setGarantia(BigDecimal garantia) {
        markAsChanged("GARANTIA", garantia);
        this.garantia = garantia;
   }

   public BigDecimal getIcms() {
        return icms;
   }

   public void setIcms(BigDecimal icms) {
        markAsChanged("ICMS", icms);
        this.icms = icms;
   }

   public BigDecimal getIpi() {
        return ipi;
   }

   public void setIpi(BigDecimal ipi) {
        markAsChanged("IPI", ipi);
        this.ipi = ipi;
   }

   public String getMelhor() {
        return melhor;
   }

   public void setMelhor(String melhor) {
        markAsChanged("MELHOR", melhor);
        this.melhor = melhor;
   }

   public BigDecimal getNumCotacao() {
        return numCotacao;
   }

   public void setNumCotacao(BigDecimal numCotacao) {
        markAsChanged("NUMCOTACAO", numCotacao);
        this.numCotacao = numCotacao;
   }

   public String getObs() {
        return obs;
   }

   public void setObs(String obs) {
        markAsChanged("OBS", obs);
        this.obs = obs;
   }

   public BigDecimal getOutros() {
        return outros;
   }

   public void setOutros(BigDecimal outros) {
        markAsChanged("OUTROS", outros);
        this.outros = outros;
   }

   public BigDecimal getPercAcresc() {
        return percAcresc;
   }

   public void setPercAcresc(BigDecimal percAcresc) {
        markAsChanged("PERCACRESC", percAcresc);
        this.percAcresc = percAcresc;
   }

   public BigDecimal getPercDesc() {
        return percDesc;
   }

   public void setPercDesc(BigDecimal percDesc) {
        markAsChanged("PERCDESC", percDesc);
        this.percDesc = percDesc;
   }

   public BigDecimal getPrazoEntrega() {
        return prazoEntrega;
   }

   public void setPrazoEntrega(BigDecimal prazoEntrega) {
        markAsChanged("PRAZOENTREGA", prazoEntrega);
        this.prazoEntrega = prazoEntrega;
   }

   public BigDecimal getPrazoMedio() {
        return prazoMedio;
   }

   public void setPrazoMedio(BigDecimal prazoMedio) {
        markAsChanged("PRAZOMEDIO", prazoMedio);
        this.prazoMedio = prazoMedio;
   }

   public BigDecimal getPrazoValProp() {
        return prazoValProp;
   }

   public void setPrazoValProp(BigDecimal prazoValProp) {
        markAsChanged("PRAZOVALPROP", prazoValProp);
        this.prazoValProp = prazoValProp;
   }

   public BigDecimal getPreco() {
        return preco;
   }

   public void setPreco(BigDecimal preco) {
        markAsChanged("PRECO", preco);
        this.preco = preco;
   }

   public BigDecimal getPrecoCalc() {
        return precoCalc;
   }

   public void setPrecoCalc(BigDecimal precoCalc) {
        markAsChanged("PRECOCALC", precoCalc);
        this.precoCalc = precoCalc;
   }

   public BigDecimal getQtdCotada() {
        return qtdCotada;
   }

   public void setQtdCotada(BigDecimal qtdCotada) {
        markAsChanged("QTDCOTADA", qtdCotada);
        this.qtdCotada = qtdCotada;
   }

   public BigDecimal getQualAtend() {
        return qualAtend;
   }

   public void setQualAtend(BigDecimal qualAtend) {
        markAsChanged("QUALATEND", qualAtend);
        this.qualAtend = qualAtend;
   }

   public BigDecimal getQualProd() {
        return qualProd;
   }

   public void setQualProd(BigDecimal qualProd) {
        markAsChanged("QUALPROD", qualProd);
        this.qualProd = qualProd;
   }

   public BigDecimal getResultCot() {
        return resultCot;
   }

   public void setResultCot(BigDecimal resultCot) {
        markAsChanged("RESULTCOT", resultCot);
        this.resultCot = resultCot;
   }

   public String getSituacao() {
        return situacao;
   }

   public void setSituacao(String situacao) {
        markAsChanged("SITUACAO", situacao);
        this.situacao = situacao;
   }

   public BigDecimal getTaxaJuro() {
        return taxaJuro;
   }

   public void setTaxaJuro(BigDecimal taxaJuro) {
        markAsChanged("TAXAJURO", taxaJuro);
        this.taxaJuro = taxaJuro;
   }

   public BigDecimal getVlrAcresc() {
        return vlrAcresc;
   }

   public void setVlrAcresc(BigDecimal vlrAcresc) {
        markAsChanged("VLRACRESC", vlrAcresc);
        this.vlrAcresc = vlrAcresc;
   }

   public BigDecimal getVlrDesc() {
        return vlrDesc;
   }

   public void setVlrDesc(BigDecimal vlrDesc) {
        markAsChanged("VLRDESC", vlrDesc);
        this.vlrDesc = vlrDesc;
   }

   public BigDecimal getVlrMoeda() {
        return vlrMoeda;
   }

   public void setVlrMoeda(BigDecimal vlrMoeda) {
        markAsChanged("VLRMOEDA", vlrMoeda);
        this.vlrMoeda = vlrMoeda;
   }

   public BigDecimal getVlrSubst() {
        return vlrSubst;
   }

   public void setVlrSubst(BigDecimal vlrSubst) {
        markAsChanged("VLRSUBST", vlrSubst);
        this.vlrSubst = vlrSubst;
   }

   public Timestamp getDhEntrega() {
        return dhEntrega;
   }

   public void setDhEntrega(Timestamp dhEntrega) {
        markAsChanged("DHENTREGA", dhEntrega);
        this.dhEntrega = dhEntrega;
   }

   public BigDecimal getCustoFinal() {
        return custoFinal;
   }

   public void setCustoFinal(BigDecimal custoFinal) {
        markAsChanged("CUSTOFINAL", custoFinal);
        this.custoFinal = custoFinal;
   }

   public String getModFrete() {
        return modFrete;
   }

   public void setModFrete(String modFrete) {
        markAsChanged("MODFRETE", modFrete);
        this.modFrete = modFrete;
   }

   public BigDecimal getPrecoMoe() {
        return precoMoe;
   }

   public void setPrecoMoe(BigDecimal precoMoe) {
        markAsChanged("PRECOMOE", precoMoe);
        this.precoMoe = precoMoe;
   }

   public BigDecimal getValProposta() {
        return valProposta;
   }

   public void setValProposta(BigDecimal valProposta) {
        markAsChanged("VALPROPOSTA", valProposta);
        this.valProposta = valProposta;
   }

   public BigDecimal getVlrDescMoe() {
        return vlrDescMoe;
   }

   public void setVlrDescMoe(BigDecimal vlrDescMoe) {
        markAsChanged("VLRDESCMOE", vlrDescMoe);
        this.vlrDescMoe = vlrDescMoe;
   }

   public BigDecimal getEmpresa() {
        return empresa;
   }

   public void setEmpresa(BigDecimal empresa) {
        markAsChanged("EMPRESA", empresa);
        this.empresa = empresa;
   }

   public BigDecimal getNumeroOs() {
        return numeroOs;
   }

   public void setNumeroOs(BigDecimal numeroOs) {
        markAsChanged("NUMEROOS", numeroOs);
        this.numeroOs = numeroOs;
   }

   public BigDecimal getCodProdEsp() {
        return codProdEsp;
   }

   public void setCodProdEsp(BigDecimal codProdEsp) {
        markAsChanged("CODPRODESP", codProdEsp);
        this.codProdEsp = codProdEsp;
   }

   public BigDecimal getFornecAprovado() {
        return fornecAprovado;
   }

   public void setFornecAprovado(BigDecimal fornecAprovado) {
        markAsChanged("FORNECAPROVADO", fornecAprovado);
        this.fornecAprovado = fornecAprovado;
   }

   public BigDecimal getSeqNotaCpa() {
        return seqNotaCpa;
   }

   public void setSeqNotaCpa(BigDecimal seqNotaCpa) {
        markAsChanged("SEQNOTACPA", seqNotaCpa);
        this.seqNotaCpa = seqNotaCpa;
   }

   public String getStatusPrecificacao() {
        return statusPrecificacao;
   }

   public void setStatusPrecificacao(String statusPrecificacao) {
        markAsChanged("STATUSPRECIFICACAO", statusPrecificacao);
        this.statusPrecificacao = statusPrecificacao;
   }

   public BigDecimal getCodNat() {
        return codNat;
   }

   public void setCodNat(BigDecimal codNat) {
        markAsChanged("CODNAT", codNat);
        this.codNat = codNat;
   }

   public BigDecimal getUsuResp() {
        return usuResp;
   }

   public void setUsuResp(BigDecimal usuResp) {
        markAsChanged("USURESP", usuResp);
        this.usuResp = usuResp;
   }

   public String getStatusEnvio() {
        return statusEnvio;
   }

   public void setStatusEnvio(String statusEnvio) {
        markAsChanged("STATUSENVIO", statusEnvio);
        this.statusEnvio = statusEnvio;
   }

   public Timestamp getDhFinal() {
        return dhFinal;
   }

   public void setDhFinal(Timestamp dhFinal) {
        markAsChanged("DHFINAL", dhFinal);
        this.dhFinal = dhFinal;
   }

   public BigDecimal getProdAgrupMin() {
        return prodAgrupMin;
   }

   public void setProdAgrupMin(BigDecimal prodAgrupMin) {
        markAsChanged("PRODAGRUPMIN", prodAgrupMin);
        this.prodAgrupMin = prodAgrupMin;
   }

   public BigDecimal getProdDecQtd() {
        return prodDecQtd;
   }

   public void setProdDecQtd(BigDecimal prodDecQtd) {
        markAsChanged("PRODDECQTD", prodDecQtd);
        this.prodDecQtd = prodDecQtd;
   }

   public BigDecimal getUltCusGer() {
        return ultCusGer;
   }

   public void setUltCusGer(BigDecimal ultCusGer) {
        markAsChanged("ULTCUSGER", ultCusGer);
        this.ultCusGer = ultCusGer;
   }

   public BigDecimal getMelhorPreco() {
        return melhorPreco;
   }

   public void setMelhorPreco(BigDecimal melhorPreco) {
        markAsChanged("MELHORPRECO", melhorPreco);
        this.melhorPreco = melhorPreco;
   }

   public Timestamp getDhInicial() {
        return dhInicial;
   }

   public void setDhInicial(Timestamp dhInicial) {
        markAsChanged("DHINICIAL", dhInicial);
        this.dhInicial = dhInicial;
   }

   public BigDecimal getCodProj() {
        return codProj;
   }

   public void setCodProj(BigDecimal codProj) {
        markAsChanged("CODPROJ", codProj);
        this.codProj = codProj;
   }

   public String getMarca() {
        return marca;
   }

   public void setMarca(String marca) {
        markAsChanged("MARCA", marca);
        this.marca = marca;
   }

   public BigDecimal getUltCusVar() {
        return ultCusVar;
   }

   public void setUltCusVar(BigDecimal ultCusVar) {
        markAsChanged("ULTCUSVAR", ultCusVar);
        this.ultCusVar = ultCusVar;
   }

   public BigDecimal getTotalParceiros() {
        return totalParceiros;
   }

   public void setTotalParceiros(BigDecimal totalParceiros) {
        markAsChanged("TOTALPARCEIROS", totalParceiros);
        this.totalParceiros = totalParceiros;
   }

   public BigDecimal getCentResult() {
        return centResult;
   }

   public void setCentResult(BigDecimal centResult) {
        markAsChanged("CENTRESULT", centResult);
        this.centResult = centResult;
   }

   public BigDecimal getUltCusRep() {
        return ultCusRep;
   }

   public void setUltCusRep(BigDecimal ultCusRep) {
        markAsChanged("ULTCUSREP", ultCusRep);
        this.ultCusRep = ultCusRep;
   }

   public BigDecimal getPrazoParc() {
        return prazoParc;
   }

   public void setPrazoParc(BigDecimal prazoParc) {
        markAsChanged("PRAZOPARC", prazoParc);
        this.prazoParc = prazoParc;
   }

   public Timestamp getDtLimPreco() {
        return dtLimPreco;
   }

   public void setDtLimPreco(Timestamp dtLimPreco) {
        markAsChanged("DTLIMPRECO", dtLimPreco);
        this.dtLimPreco = dtLimPreco;
   }

   public BigDecimal getRespMinCot() {
        return respMinCot;
   }

   public void setRespMinCot(BigDecimal respMinCot) {
        markAsChanged("RESPMINCOT", respMinCot);
        this.respMinCot = respMinCot;
   }

   public Timestamp getDtLimite() {
        return dtLimite;
   }

   public void setDtLimite(Timestamp dtLimite) {
        markAsChanged("DTLIMITE", dtLimite);
        this.dtLimite = dtLimite;
   }

   public Timestamp getDtEnvioCot() {
        return dtEnvioCot;
   }

   public void setDtEnvioCot(Timestamp dtEnvioCot) {
        markAsChanged("DTENVIOCOT", dtEnvioCot);
        this.dtEnvioCot = dtEnvioCot;
   }

   public BigDecimal getSeqItemCot() {
        return seqItemCot;
   }

   public void setSeqItemCot(BigDecimal seqItemCot) {
        markAsChanged("SEQITEMCOT", seqItemCot);
        this.seqItemCot = seqItemCot;
   }

   public String getStatusProdCot() {
        return statusProdCot;
   }

   public void setStatusProdCot(String statusProdCot) {
        markAsChanged("STATUSPRODCOT", statusProdCot);
        this.statusProdCot = statusProdCot;
   }

   public BigDecimal getUsuSol() {
        return usuSol;
   }

   public void setUsuSol(BigDecimal usuSol) {
        markAsChanged("USUSOL", usuSol);
        this.usuSol = usuSol;
   }

   public BigDecimal getMelhorFornEc() {
        return melhorFornEc;
   }

   public void setMelhorFornEc(BigDecimal melhorFornEc) {
        markAsChanged("MELHORFORNEC", melhorFornEc);
        this.melhorFornEc = melhorFornEc;
   }

   public BigDecimal getNuNotaCpa() {
        return nuNotaCpa;
   }

   public void setNuNotaCpa(BigDecimal nuNotaCpa) {
        markAsChanged("NUNOTACPA", nuNotaCpa);
        this.nuNotaCpa = nuNotaCpa;
   }

   public BigDecimal getTotalProduto() {
        return totalProduto;
   }

   public void setTotalProduto(BigDecimal totalProduto) {
        markAsChanged("TOTALPRODUTO", totalProduto);
        this.totalProduto = totalProduto;
   }

   public BigDecimal getQtdParcPagt() {
        return qtdParcPagt;
   }

   public void setQtdParcPagt(BigDecimal qtdParcPagt) {
        markAsChanged("QTDPARCPAGT", qtdParcPagt);
        this.qtdParcPagt = qtdParcPagt;
   }

   public String getCondPagt() {
        return condPagt;
   }

   public void setCondPagt(String condPagt) {
        markAsChanged("CONDPAGT", condPagt);
        this.condPagt = condPagt;
   }

   public BigDecimal getUltVlrUnitComp() {
        return ultVlrUnitComp;
   }

   public void setUltVlrUnitComp(BigDecimal ultVlrUnitComp) {
        markAsChanged("ULTVLRUNITCOMP", ultVlrUnitComp);
        this.ultVlrUnitComp = ultVlrUnitComp;
   }

   public BigDecimal getProdDecVlr() {
        return prodDecVlr;
   }

   public void setProdDecVlr(BigDecimal prodDecVlr) {
        markAsChanged("PRODDECVLR", prodDecVlr);
        this.prodDecVlr = prodDecVlr;
   }

   public String getTipoColPreco() {
        return tipoColPreco;
   }

   public void setTipoColPreco(String tipoColPreco) {
        markAsChanged("TIPOCOLPRECO", tipoColPreco);
        this.tipoColPreco = tipoColPreco;
   }

   public BigDecimal getCodMotCan() {
        return codMotCan;
   }

   public void setCodMotCan(BigDecimal codMotCan) {
        markAsChanged("CODMOTCAN", codMotCan);
        this.codMotCan = codMotCan;
   }

   public String getComplDesc() {
        return complDesc;
   }

   public void setComplDesc(String complDesc) {
        markAsChanged("COMPLDESC", complDesc);
        this.complDesc = complDesc;
   }

   public String getObsMotCanc() {
        return obsMotCanc;
   }

   public void setObsMotCanc(String obsMotCanc) {
        markAsChanged("OBSMOTCANC", obsMotCanc);
        this.obsMotCanc = obsMotCanc;
   }

   @Override
   public String getTableName() {
        return "TGFITC";
   }

   @Override
   public String getEntityName() {
        return "ItemCotacao";
   }

   @Override
   public ItemCotacao fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.aliqIcms = vo.asBigDecimal("ALIQICMS");
        this.aliqIpi = vo.asBigDecimal("ALIQIPI");
        this.cabecalho = vo.asString("CABECALHO");
        this.codContato = vo.asBigDecimal("CODCONTATO");
        this.codLocal = vo.asBigDecimal("CODLOCAL");
        this.codMoeda = vo.asBigDecimal("CODMOEDA");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codTipVenda = vo.asBigDecimal("CODTIPVENDA");
        this.codVol = vo.asString("CODVOL");
        this.confiabForn = vo.asBigDecimal("CONFIABFORN");
        this.controle = vo.asString("CONTROLE");
        this.cusGer = vo.asBigDecimal("CUSGER");
        this.cusMedIcm = vo.asBigDecimal("CUSMEDICM");
        this.cusRep = vo.asBigDecimal("CUSREP");
        this.cusSemIcm = vo.asBigDecimal("CUSSEMICM");
        this.cusVariavel = vo.asBigDecimal("CUSVARIAVEL");
        this.difAliqIcms = vo.asBigDecimal("DIFALIQICMS");
        this.diferenciador = vo.asBigDecimal("DIFERENCIADOR");
        this.dtColetaPreco = vo.asTimestamp("DTCOLETAPRECO");
        this.dtMoeda = vo.asTimestamp("DTMOEDA");
        this.fatMinimo = vo.asBigDecimal("FATMINIMO");
        this.frete = vo.asBigDecimal("FRETE");
        this.garantia = vo.asBigDecimal("GARANTIA");
        this.icms = vo.asBigDecimal("ICMS");
        this.ipi = vo.asBigDecimal("IPI");
        this.melhor = vo.asString("MELHOR");
        this.numCotacao = vo.asBigDecimal("NUMCOTACAO");
        this.obs = vo.asString("OBS");
        this.outros = vo.asBigDecimal("OUTROS");
        this.percAcresc = vo.asBigDecimal("PERCACRESC");
        this.percDesc = vo.asBigDecimal("PERCDESC");
        this.prazoEntrega = vo.asBigDecimal("PRAZOENTREGA");
        this.prazoMedio = vo.asBigDecimal("PRAZOMEDIO");
        this.prazoValProp = vo.asBigDecimal("PRAZOVALPROP");
        this.preco = vo.asBigDecimal("PRECO");
        this.precoCalc = vo.asBigDecimal("PRECOCALC");
        this.qtdCotada = vo.asBigDecimal("QTDCOTADA");
        this.qualAtend = vo.asBigDecimal("QUALATEND");
        this.qualProd = vo.asBigDecimal("QUALPROD");
        this.resultCot = vo.asBigDecimal("RESULTCOT");
        this.situacao = vo.asString("SITUACAO");
        this.taxaJuro = vo.asBigDecimal("TAXAJURO");
        this.vlrAcresc = vo.asBigDecimal("VLRACRESC");
        this.vlrDesc = vo.asBigDecimal("VLRDESC");
        this.vlrMoeda = vo.asBigDecimal("VLRMOEDA");
        this.vlrSubst = vo.asBigDecimal("VLRSUBST");
        this.dhEntrega = vo.asTimestamp("DHENTREGA");
        this.custoFinal = vo.asBigDecimal("CUSTOFINAL");
        this.modFrete = vo.asString("MODFRETE");
        this.precoMoe = vo.asBigDecimal("PRECOMOE");
        this.valProposta = vo.asBigDecimal("VALPROPOSTA");
        this.vlrDescMoe = vo.asBigDecimal("VLRDESCMOE");
        this.empresa = vo.asBigDecimal("EMPRESA");
        this.numeroOs = vo.asBigDecimal("NUMEROOS");
        this.codProdEsp = vo.asBigDecimal("CODPRODESP");
        this.fornecAprovado = vo.asBigDecimal("FORNECAPROVADO");
        this.seqNotaCpa = vo.asBigDecimal("SEQNOTACPA");
        this.statusPrecificacao = vo.asString("STATUSPRECIFICACAO");
        this.codNat = vo.asBigDecimal("CODNAT");
        this.usuResp = vo.asBigDecimal("USURESP");
        this.statusEnvio = vo.asString("STATUSENVIO");
        this.dhFinal = vo.asTimestamp("DHFINAL");
        this.prodAgrupMin = vo.asBigDecimal("PRODAGRUPMIN");
        this.prodDecQtd = vo.asBigDecimal("PRODDECQTD");
        this.ultCusGer = vo.asBigDecimal("ULTCUSGER");
        this.melhorPreco = vo.asBigDecimal("MELHORPRECO");
        this.dhInicial = vo.asTimestamp("DHINICIAL");
        this.codProj = vo.asBigDecimal("CODPROJ");
        this.marca = vo.asString("MARCA");
        this.ultCusVar = vo.asBigDecimal("ULTCUSVAR");
        this.totalParceiros = vo.asBigDecimal("TOTALPARCEIROS");
        this.centResult = vo.asBigDecimal("CENTRESULT");
        this.ultCusRep = vo.asBigDecimal("ULTCUSREP");
        this.prazoParc = vo.asBigDecimal("PRAZOPARC");
        this.dtLimPreco = vo.asTimestamp("DTLIMPRECO");
        this.respMinCot = vo.asBigDecimal("RESPMINCOT");
        this.dtLimite = vo.asTimestamp("DTLIMITE");
        this.dtEnvioCot = vo.asTimestamp("DTENVIOCOT");
        this.seqItemCot = vo.asBigDecimal("SEQITEMCOT");
        this.statusProdCot = vo.asString("STATUSPRODCOT");
        this.usuSol = vo.asBigDecimal("USUSOL");
        this.melhorFornEc = vo.asBigDecimal("MELHORFORNEC");
        this.nuNotaCpa = vo.asBigDecimal("NUNOTACPA");
        this.totalProduto = vo.asBigDecimal("TOTALPRODUTO");
        this.qtdParcPagt = vo.asBigDecimal("QTDPARCPAGT");
        this.condPagt = vo.asString("CONDPAGT");
        this.ultVlrUnitComp = vo.asBigDecimal("ULTVLRUNITCOMP");
        this.prodDecVlr = vo.asBigDecimal("PRODDECVLR");
        this.tipoColPreco = vo.asString("TIPOCOLPRECO");
        this.codMotCan = vo.asBigDecimal("CODMOTCAN");
        this.complDesc = vo.asString("COMPLDESC");
        this.obsMotCanc = vo.asString("OBSMOTCANC");
        return this;
   }
}
